package com.add.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ORM_conexion {

  public static void main(String[] args) {

    try (Session s = HibernateUtil.getSessionFactory().openSession()) {
      Transaction t = null;
      
      try {
        t = s.beginTransaction();

        User user1 = new User();
        user1.setId(1);
        user1.setUserName("Paco");
        user1.setUserMessage("Hello world from Pepe");
        s.save(user1);
        /*
        Estudiante estudiante= new Estudiante();
        estudiante.setId(2);
        estudiante.setNombre("Paco");
        estudiante.setApellido("Arias");
        estudiante.setModulo("SMR");
        s.save(estudiante);

        /*
        Empleado empleado = new Empleado();
        empleado.setDni("71219222O");
        empleado.setNomEmp("javi");
        
        s.save(empleado);
        
        /*
        User user1 = new User();
        user1.setId(1);
        user1.setUserName("Pepe");
        user1.setUserMessage("Hello world from Pepe");
                s.save(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setUserName("Juan");
        user2.setUserMessage("Hello world from Juan");
                s.save(user2);


    /*   
        Estudiante estudiante= new Estudiante();
        estudiante.setId(2);
        estudiante.setNombre("Paco");
        estudiante.setApellido("Arias");
        estudiante.setModulo("SMR");
        s.save(estudiante);*/
   
        t.commit();

      } catch (Exception e) {
        e.printStackTrace(System.err);
        if (t != null) {
          t.rollback();
        }
      }
    }
  }
  
}