package pl.touk.sputnik;

import org.junit.jupiter.api.Test;
import pl.touk.sputnik.NewFunction;

import static org.assertj.core.api.Assertions.assertThat;

public class NewFunctionTest{
    
    

    @Test
    public void testSum(){
        NewFunction function = new NewFunction(4,6);
        assertThat(function.sum()).isEqualTo(10);
    }

    @Test 
    public void testMultiplication(){
        NewFunction function = new NewFunction(4, 6);
        assertThat(function.multiplication()).isEqualTo(24);
    }

    @Test 
    public void testSubstraction(){
        NewFunction function = new NewFunction(6, 4);
        assertThat(function.substraction()).isEqualTo(2);
    } 

    @Test  
    public void testGet(){
        NewFunction function = new NewFunction(4, 6);
        assertThat(function.getNum1()).isEqualTo(4);
    }

    @Test 
    public void testGetSet(){
        NewFunction function = new NewFunction(4, 6);
        function.setNum1(10);
        assertThat(function.getNum1()).isEqualTo(10);
    }


}