
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Contact
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/10/24  21:09
 * @Veresion 1.0
 */
public class Contact {
    Map<String,User>  map=new HashMap<>();
    public void add(String name,String mobilePhone,String officePhone)throws NameExistException{
        User user=new User(name,mobilePhone,officePhone);
        if(map.containsKey(name)){
            throw new NameExistException();
        }
        map.put(name,user);
    }
    public User search(String name){

       return map.get(name);

    }
    public void remove(String name)throws NameIsNotExist{
        if(!map.containsKey(name)){
            throw new NameIsNotExist();
        }
        map.remove(name);
    }
    public void update(String name,String mobilePhone,String officePhone){
        if(map.containsKey(name)){
            map.remove(name);
        }
        User user=new User(name,mobilePhone,officePhone);
        map.put(name,user);
    }
    public void show(){
        for(String s:map.keySet()){
            System.out.println(map.get(s));
        }
    }
}
