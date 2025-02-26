import java.util.Scanner;
public class Calc {
        private double num1;
        private double num2;


        public double getNum1() {
                return this.num1;
        }
        public void setNum1(double number1){
                this.num1 = number1;
        }
        public double getNum2(){return this.num2;}
        public void setNum2(double number2){
                this.num2 = number2;
        }
        public double add() {
                return this.num1+ this.num2;}
        public double subtract() {
                return this.num1- this.num2;
        }
        public double multiply() {
                return this.num1* this.num2;
        }
        public double divide() {
                return this.num1/ this.num2;
        }

        public String toString(){
                return this.num1 + "\n" + this.num2;
        }
}
