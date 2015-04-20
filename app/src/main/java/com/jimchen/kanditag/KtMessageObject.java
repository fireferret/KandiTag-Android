package com.jimchen.kanditag;

/**
 * Created by Jim on 3/4/15.
 */
public class KtMessageObject {

    private String message, from_id, from_name, timestamp;

    // for message
    private String to_id, to_name;

    // for group message
    private String kandi_id, kandi_name;

    public KtMessageObject() {}

    public void setKandiID(String id) {
        this.kandi_id = id;
    }

    public void setKandiName(String name) {
        this.kandi_name = name;
    }

    public void setMessage(String mssg) {
        this.message = mssg;
    }

    public void setTo_id(String id) {
        this.to_id = id;
    }

    public void setTo_name(String name) {
        this.to_name = name;
    }

    public void setFrom_id(String id) {
        this.from_id = id;
    }

    public void setFrom_name(String name) {
        this.from_name = name;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getTo_id() {
        return to_id;
    }

    public String getTo_name() {
        return to_name;
    }

    public String getFrom_id() {
        return from_id;
    }

    public String getFrom_name() {
        return from_name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getKandiID() {
        return kandi_id;
    }

    public String getKandiName() {
        return kandi_name;
    }

}
