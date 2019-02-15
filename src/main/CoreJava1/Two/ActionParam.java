package Two;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionParam {

    @JsonProperty(value = "file_name")
    String fileName;
    Object data;



    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ActionParam{" +
                ", fileName='" + fileName + '\'' +
                ", data=" + data +
                '}';
    }
}