package tr.com.zafergurkan.core;

public class CoreFields {
    private String userName="root";
    private String password="";
    private String url="jdbc:mysql://localhost:3306/satisvestok?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";


    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public String getUrl() {
        return url;
    }
}
