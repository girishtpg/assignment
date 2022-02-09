package PageFunctions;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ObjectRepositories.Login;
import configFile.JsonWriter;
import Utils.CoreActions;

public class Loginfunc extends CoreActions {
    public Loginfunc(WebDriver bot) {
        super(bot);
    }

    public void verifySite() {
        JsonWriter json_file = new JsonWriter();
        waitForVisibility(Login.Login);
        Assert.assertEquals(json_file.read_value_from_json("PageTitle"),pageTitle());
    }

    public void enterUsernamesList(){
        JsonWriter json_file = new JsonWriter();
        String[] lines = textRetriever(Login.select_usernames_list).split("\\r?\\n|\\r");
        for(int i=1;i<5;i++){
            System.out.print("Username:");
            System.out.println(lines[i]);
            enterUsername(lines[i]);
            sleep(1);
            System.out.print("Password:");
            System.out.println(json_file.read_value_from_json("Password"));
            enterPassword(json_file.read_value_from_json("Password"));
            sleep(1);
            System.out.println(lines[i].strip().replace("\n","").equals(json_file.read_value_from_json("Username").strip().replace("\n","")));
            if(lines[i].strip().replace("\n","").equals(json_file.read_value_from_json("Username").strip().replace("\n",""))){
                clickOnLogin();
                sleep(1);
                if(bot.getCurrentUrl().equals(json_file.read_value_from_json("InventoryURL"))){
                    Assert.assertEquals(json_file.read_value_from_json("InventoryURL"), bot.getCurrentUrl());
                    break;
                }else{
                    sleep(1);
                }
            }
            else{
                sleep(1);
            }
        }
        Assert.assertEquals(json_file.read_value_from_json("InventoryURL"), bot.getCurrentUrl());
    }

    public void enterUsername(String username) {
        enterText(Login.Username, username);
    }

    public void enterPassword(String password) {
        enterText(Login.Password, password);
    }

    public void password() {
        sleep(3);
        click(Login.Password);
    }

    public void clickOnLogin() {
        click(Login.Login);
    }

}
