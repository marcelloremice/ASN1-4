import java.util.Scanner;
public class Calc {
        private double Num1;
        private double Num2;


        public double getNum1() {
                return Num1;
        }
        public void setNum1(double number1){
                this.Num1 = number1;
        }
        public double getNum2(){
                return Num2;
        }
        public void setNum2(double number2){
                this.Num2 = number2;
        }
        public double add() {
                return Num1+Num2;
        }
        public double subtract() {
                return Num1-Num2;
        }
        public double multiply() {
                return Num1*Num2;
        }
        public double divide() {
                return Num1/Num2;
        }

}