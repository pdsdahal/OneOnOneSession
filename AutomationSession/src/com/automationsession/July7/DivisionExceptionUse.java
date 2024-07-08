package com.automationsession.July7;

public class DivisionExceptionUse {

    public void div(double num1, double num2) throws DivisionException, NullPointerException {

        if(num2 == 0){
            throw new DivisionException("You divided by 0.");
        }else{

            double reslt = num1/num2;
            System.out.println(num1 + " / "+num2 + " = "+reslt);
        }
    }


    public static void main(String[] args) {
        DivisionExceptionUse obj = new DivisionExceptionUse();

        try {
            obj.div(10, 2);
        }catch (Exception e){
            System.out.println("Excpetion Message : "+e.getMessage());

        }
    }


}
