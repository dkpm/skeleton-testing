package definition;

import groovy.json.internal.LazyMap;

public class CrudProcessos {

    private static final String URL_PROCESSOS = "http://agapito-server.herokuapp.com/processos/";
    private static LazyMap fieldsJson = new LazyMap();
    private static String lastId;

    public static void addFields(String field, String value) {
        fieldsJson.put(field, value);
    }

    public static void clearFields() {
        fieldsJson.clear();
    }

    public static LazyMap getFields() { return fieldsJson;
    }

    public static String getEndPoint() {
        return URL_PROCESSOS;
    }

    public static String getLastId() {
        return lastId;
    }

    public static void setLastId(String id) {lastId = id;}
}
