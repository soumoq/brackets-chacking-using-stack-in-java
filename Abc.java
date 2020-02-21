package c;
import java.io.Serializable;
import java.util.*;
public class Abc {
    public static void main(String[] args) {
        new Abc().check();
    }

    public void check()
    {
        Stack s=new Stack();
        char a[]={'[','{','(',')','}',']'};
        for(int i=0;i<6;i++)
        {
            if(a[i]=='[' || a[i]=='{' || a[i]=='(' )
            {
                s.push(a[i]);
            }
        }
        for(int i=0;i<6;i++)
        {
            if(a[i]==')' && s.top()=='(')
            {
                s.pop();
            }
            if(a[i]=='}' && s.top()=='{')
            {
                s.pop();
            }
            if(a[i]==']' && s.top()=='[')
            {
                s.pop();
            }
        }
        s.print();
    }
}

class Stack
{
    char a[]=new char[10];
    static int top=-1;

    public char top()
    {
        if(isEmpty())
            return '\0';
        else
            return a[top];
    }

    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public void push(char n)
    {
        top++;
        a[top]=n;
        System.out.println("Push ="+a[top]);
    }

    public void pop()
    {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("pop =" + a[top]);
            top--;
        }
    }
    public void print()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else {
            for (int i = 0; i <= top; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
