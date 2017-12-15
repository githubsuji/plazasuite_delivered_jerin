package com.plazasuite.plazasuiteapp;

import com.jfoenix.controls.JFXDecorator;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.plazasuite.plazasuiteapp.config.jpa.JpaConfig;
import com.plazasuite.plazasuiteapp.constants.routes.Routes;
import com.plazasuite.plazasuiteapp.config.springbeans.BeanConfig;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javafx.stage.StageStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author SUJIKUMAR
 */
@Import({JpaConfig.class, BeanConfig.class})
@SpringBootApplication(scanBasePackages={"com.plazasuite.plazasuiteapp"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class PlazaSuiteFxMain extends Application /*implements CommandLineRunner*/{
public static ApplicationContext springAppcontext;
//@Autowired
//private ApplicationContext appContext;

    @Override
    public void start(Stage stage) throws Exception {
        showLoginPage(stage);
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //disabled banner, don't want to see the spring logo
//        Object[] context = {PlazaSuiteFxMain.class,LoginController.class};
//        springAppcontext = new SpringApplication(context);
//        springAppcontext.setBannerMode(Banner.Mode.OFF);
//        springAppcontext.run(args
//                springAppcontext.
          System.out.println("springAppcontext1=="+springAppcontext);
          
         SpringApplication.run(PlazaSuiteFxMain.class, args); 
        
         
    }
    @Bean
    public CommandLineRunner run(ApplicationContext appContext) {
        return args -> {
         System.out.println("appContext=="+appContext);
        springAppcontext = appContext;
        System.out.println("springAppcontext2=="+springAppcontext);
        launch(args);
        String[] beans = appContext.getBeanDefinitionNames();
        Arrays.stream(beans).sorted().forEach(System.out::println);

        };
    }
//    @Override
//    public void run(String... strings) throws Exception {
//        System.out.println("appContext=="+appContext);
//        springAppcontext = appContext;
//        System.out.println("springAppcontext2=="+springAppcontext);
//        launch(strings);
//
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    private void showLoginPage(Stage stage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource(Routes.LOGIN_VIEW));
            JFXDecorator decorator=new JFXDecorator(stage, root, false, false, true);
            decorator.setCustomMaximize(false);
            decorator.setBorder(Border.EMPTY);
            Scene scene = new Scene(decorator);
            scene.getStylesheets().add(PlazaSuiteFxMain.class.getResource("/styles/Styles.css").toExternalForm());
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.setTitle("PlazaSuite");
            stage.setIconified(false);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(PlazaSuiteFxMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
