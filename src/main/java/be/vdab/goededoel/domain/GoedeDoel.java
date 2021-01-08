package be.vdab.goededoel.domain;

import java.math.BigDecimal;

public class GoedeDoel {
   private final String naam;
   private BigDecimal opgebracht;
   private BigDecimal opbrengst = BigDecimal.ZERO;

   public GoedeDoel(String naam) {
      this.naam = naam;
   }

   public String getNaam() {
      return naam;
   }

   public BigDecimal getOpbrengst() {
      return opbrengst;
   }

   public BigDecimal getOpgebracht() {
      return opgebracht;
   }

   @Override
   public boolean equals(Object object) {
      if (object instanceof GoedeDoel) {
         GoedeDoel ander = (GoedeDoel) object;
         return naam.equalsIgnoreCase(ander.naam);
      }
      return false;
   }

   @Override
   public int hashCode() {
      return this.naam.toUpperCase().hashCode();
   }

}
