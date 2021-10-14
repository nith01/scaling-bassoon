package com.training.sepOOPs.Aggragation;

public class Circle {
Operation op;//aggregation
double pi = 3.14;

double area(int radius){
    op =new Operation();
    int r2 = op.rSquare(radius);//code reusability
    return  pi*r2;
}


}
