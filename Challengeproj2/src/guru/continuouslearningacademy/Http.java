package guru.continuouslearningacademy;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.openqa.selenium.remote.http.HttpResponse;
import sun.net.www.http.HttpClient;

public class Http {

    private HttpClient httpClient;
    private HttpGet get;
    private HttpResponse response;
    private String resource;

    public Http(){
        this.httpClient = HttpClients.createDefault();
        this.get = null;
        this.resource = null;
    }

    public String GET(String url){
        this.get = new HttpGet(url);

        try{
            this.response = this.httpClient.execute(this.get);
        }
        catch (Exception e){

        }

        return resource;
    }


}
