import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by MUL04 on 2/9/2018.
 */

public class UserLocalStore {
    public static final String SP_NAME= "userDetails";
    SharedPreferences userLocalDatabase;
    public UserLocalStore(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_NAME,0);
    }
    public void storeUserData(User user){
        SharedPreferences.Editor spEditor= userLocalDatabase.edit();
        spEditor.putString("nim",user.nim);
        spEditor.putString("password",user.password);
        spEditor.commit();
    }
    public User getLoggedinUser(){
        String nim=userLocalDatabase.getString("nim","");
        String password=userLocalDatabase.getString("password","");
        User StoredUser=new User(nim,password);
        return StoredUser;
    }
    public void setUserLoggedIn(boolean loggedIn){
        SharedPreferences.Editor spEditor= userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn",loggedIn);
        spEditor.commit();
    }
    public void clearUserData(){
        SharedPreferences.Editor spEditor= userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
