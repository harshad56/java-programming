public class Main {
    public static void main(String[] args) {
      Calculater calculte=new Calculater();
      calculte.setFisrtnumber(3.5);
      calculte.setSecondnumber(56);



      double addresult=calculte.getAdditionResult();
      System.out.println("Addition is:"+addresult);

      double subresult=calculte.getSubstractionResult();
      System.out.println("substraction is:"+subresult);

      double mulresult=calculte.getMultiplicationResult();
      System.out.println("mutliplication is:"+mulresult);

      double divresult=calculte.getdivisionResult();
      System.out.println("division is:"+divresult);
    }
}
