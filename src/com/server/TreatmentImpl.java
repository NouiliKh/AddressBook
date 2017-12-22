package com.server;

import javax.json.*;
import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Objects;

import static javax.json.Json.createReader;

public class TreatmentImpl extends UnicastRemoteObject implements TreatmentInterface {

    protected TreatmentImpl() throws RemoteException {
        super();
    }

    @Override
    public Void addEmployee(Employee emp) throws RemoteException {
        InputStream in = null;

        try {
            in= new FileInputStream("DataSet.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        JsonReader reader = createReader(in);
        JsonObject employeeObject = reader.readObject();
        JsonArray employeeArray = employeeObject.getJsonArray("FST");
        reader.close();


        JsonArrayBuilder employeeBuilder = Json.createArrayBuilder();

        for (int i=0 ;i< employeeArray.size();i++)
        {
            employeeBuilder.add(employeeArray.getJsonObject(i));
        }
        employeeBuilder.add(Json.createObjectBuilder().add("prénom" ,emp.getEmployeeName()).add("nom",emp.getEmplyeeFamilyName()).add("cin",emp.getEmployeeCIN()).add("telephone",emp.getEmplyeeTelephoneNumber()));
        JsonArray employeeJsonArray= employeeBuilder.build();
        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
        jsonObjectBuilder.add("FST", employeeJsonArray);
        JsonObject emp01=jsonObjectBuilder.build();
        OutputStream out = null;
        try {
            out = new FileOutputStream("DataSet.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        JsonWriter jsonwriter=Json.createWriter(out);
        jsonwriter.writeObject(emp01);
        // jsonwriter.writeObject(employeeObject);

        jsonwriter.close();
        return null;
    }

    @Override
    public Void updateEmployee(Employee emp) throws RemoteException {
        InputStream in = null;
        try {
            in = new FileInputStream("DataSet.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //create JsonReader object
        JsonReader jsonReader = createReader(in);
        //get JsonObject from JsonReader
        JsonObject employeeObject = jsonReader.readObject();
        JsonArray employeeArray = employeeObject.getJsonArray("FST");
        //we can close IO resource and JsonReader now
        jsonReader.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        OutputStream out = null;
        try {
            out = new FileOutputStream("DataSet.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        JsonArrayBuilder employeeBuilder = Json.createArrayBuilder();


        for (int i=0 ;i< employeeArray.size();i++)
        {
            if(employeeArray.getJsonObject(i).getInt("cin")!=emp.getEmployeeCIN())
            {
                employeeBuilder.add(employeeArray.getJsonObject(i));
            }
            else
            {
                employeeBuilder.add(Json.createObjectBuilder().add("prénom" ,emp.getEmployeeName()).add("nom",emp.getEmplyeeFamilyName()).add("cin",emp.getEmployeeCIN()).add("telephone",emp.getEmplyeeTelephoneNumber()));
            }

        }
        JsonArray employeeJsonArray= employeeBuilder.build();
        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
        jsonObjectBuilder.add("FST", employeeJsonArray);
        JsonObject emp01=jsonObjectBuilder.build();

        JsonWriter jsonwriter=Json.createWriter(out);
        jsonwriter.writeObject(emp01);
        // jsonwriter.writeObject(employeeObject);

        jsonwriter.close();
        return null;
    }

    @Override
    public Void deleteEmployee(Employee emp) throws RemoteException {
        InputStream in = null;
        try {
            in = new FileInputStream("DataSet.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //create JsonReader object
        JsonReader jsonReader = createReader(in);
        //get JsonObject from JsonReader
        JsonObject employeeObject = jsonReader.readObject();
        JsonArray employeeArray = employeeObject.getJsonArray("FST");
        //we can close IO resource and JsonReader now
        jsonReader.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        OutputStream out = null;
        try {
            out = new FileOutputStream("DataSet.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        JsonArrayBuilder employeeBuilder = Json.createArrayBuilder();


        for (int i=0 ;i< employeeArray.size();i++)
        {
            if(!Objects.equals(employeeArray.getJsonObject(i).getString("nom"), emp.getEmplyeeFamilyName()))
            {
                employeeBuilder.add(employeeArray.getJsonObject(i));
            }

        }
        JsonArray employeeJsonArray= employeeBuilder.build();
        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
        jsonObjectBuilder.add("FST", employeeJsonArray);
        JsonObject emp01=jsonObjectBuilder.build();

        JsonWriter jsonwriter=Json.createWriter(out);
        jsonwriter.writeObject(emp01);
        // jsonwriter.writeObject(employeeObject);

        jsonwriter.close();
        return null;


    }

    @Override
    public Employee findEmployee(String familyName) throws RemoteException {
        Employee emp = null;
        InputStream in = null;
        try {
            in = new FileInputStream("DataSet.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //create JsonReader object
        JsonReader jsonReader = createReader(in);
        //get JsonObject from JsonReader
        JsonObject employeeObject = jsonReader.readObject();
        JsonArray employeeArray = employeeObject.getJsonArray("FST");
        //we can close IO resource and JsonReader now
        jsonReader.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i=0 ;i< employeeArray.size();i++)
        {
            if(!Objects.equals(employeeArray.getJsonObject(i).getString("nom"), familyName))
            {
                emp = new Employee(employeeArray.getJsonObject(i).getString("prénom"),employeeArray.getJsonObject(i).getString("nom"),employeeArray.getJsonObject(i).getInt("cin"),employeeArray.getJsonObject(i).getInt("telephone"));
            }
        }
        System.out.print(emp.getEmplyeeFamilyName());
        emp.getDescription();
        return emp;

    }
}
