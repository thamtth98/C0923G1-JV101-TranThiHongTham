package ss8_MVC.example;


    public class App {
        public static void main(String[] args) {
            LoginView view = new LoginView();
            LoginController control = new LoginController(view);
            // goi ham login
            control.login();
        }
    }

