/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

/**
 *
 * @author ryang
 */
public class PieceWorker extends Employee{
    
   private double wage;
   private int pieces;

   // constructor
   public PieceWorker(String firstName, String lastName, 
      String socialSecurityNumber, double wage,int pieces)
   {
      super(firstName, lastName, socialSecurityNumber); 

      if (wage < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.wage = wage;
      this.pieces=pieces;
   } 


   // calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings()                                            
   {                                                                   
      return getWeeklySalary();                                        
   }                                             

   // return String representation of SalariedEmployee object   
   @Override                                                    
   public String toString()                                     
   {                                                            
      return String.format("salaried employee: %s%n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary());
   }

    /**
     * @return the wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(double wage) {
        this.wage = wage;
    }

    /**
     * @return the pieces
     */
    public int getPieces() {
        return pieces;
    }

    /**
     * @param pieces the pieces to set
     */
    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}
