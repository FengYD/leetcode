package java8.ex;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author fengyadong001
 * @date 2019/11/14 12:31 PM
 * @description
 */
public class Check {

    public void test1() throws SQLIntegrityConstraintViolationException{
        throw new SQLIntegrityConstraintViolationException();
    }


}