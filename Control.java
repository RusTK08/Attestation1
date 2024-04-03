import java.lang.Integer;
public class Control extends View{ ///ИЛИ PRESENT ЗДЕСЬ СОЕДИНЯЕШЬ МОДЕЛЬ С ВЬЮШКОЙ ЗАНЧЕНИЯ ВЬЮШКИ ПЕРЕДАЕШЬ МОДЕЛЕ
    private View arg;
    private int i;
    private Model model;
    private int it;
    //private scan();
    public Control() {
        arg = new View();
        model = new Model();
        model.num1 = arg.scan();
        model.arr = arg.scan1();
        model.num2 = arg.scan3();
        run();
        int s = run();
        print(s);
        
        
        
        
    }
    public int run(){
        
        return model.itog(model.num1, model.num2, model.arr);
         
    }
    public void print(int otvet){           
        System.out.println(String.format("otvet:%d", otvet));
        }
    // @Override
    // public String toString(){
    //     return String.format("s:%d", s);
    
    // }
    
        
    
}