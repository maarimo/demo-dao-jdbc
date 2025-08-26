package db;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBConfig {
    private static Properties props = new Properties();

    static {
        try(InputStream input = DBConfig.class.getClassLoader().getResourceAsStream("db/db.properties")){
            if (input == null) {
                throw new RuntimeException("Arquivo db.properties não encontrado no classpath");
            }
            props.load(input);
        } catch (IOException e){
            throw new RuntimeException("Erro ao carregar db.properties", e);
        }
    }

    public static String getUrl(){
        return props.getProperty("db.url");
    }

    public static String getUser(){
        return props.getProperty("db.user");
    }

    public static String getPassword(){
        return props.getProperty("db.password");
    }
}
