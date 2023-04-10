package com.rplbo.mathex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void test1()
    {
        //25 * 4^2
        OperandNode o1 = new OperandNode(25);
        OperandNode o2 = new OperandNode(4);
        UnaryOperator op1 = new Kuadrat(o2); // 4^2
        OperatorNode op2 = new Kali(o1,op1);
        System.out.println(op2.hitung());
    }

    @Test
    public void test2()
    {
        //5 + 3 * 4^2
        OperandNode o2 = new OperandNode(4);
        UnaryOperator op1 = new Kuadrat(o2); // 4^2
        OperandNode o3 = new OperandNode(5);
        OperandNode o4 = new OperandNode(3);
        OperatorNode op3 = new Kali(o4,op1);
        OperatorNode op4 = new Tambah(o3,op3);
        System.out.println(op4.hitung());
    }


}
