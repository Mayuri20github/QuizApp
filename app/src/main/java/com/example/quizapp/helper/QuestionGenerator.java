package com.example.quizapp.helper;

import com.example.quizapp.data.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuestionGenerator {

    public static List<Question> getQuestions(){
        List<Question> list= new ArrayList<>();

    Question question= new Question();
    question.setId(1);
    question.setQuestion("What is java?");
    question.setOption1("Programming Language");
    question.setOption2("Gaming Language");
    question.setOption3("To create WebPages");
    question.setOption4("None of these");
    question.setAnswer("Programming Language");
    list.add(question);

    Question question1= new Question();
        question.setId(1);
        question1.setQuestion("Which of the following option leads to the portability and security of Java?");
        question1.setOption1("Bytecode is executed by JVM");
        question1.setOption2("The applet makes the Java code secure and portable");
        question1.setOption3("Use of exception handling");
        question1.setOption4("Dynamic binding between objects");
        question1.setAnswer("Bytecode is executed by JVM");
        list.add(question1);

        Question question2= new Question();
        question.setId(1);
        question2.setQuestion("_____ is used to find and fix bugs in the Java programs.");
        question2.setOption1("JVM");
        question2.setOption2("JRE");
        question2.setOption3("JDK");
        question2.setOption4("JDB");
        question2.setAnswer("JDB");
        list.add(question2);

        Question question3= new Question();
        question.setId(1);
        question3.setQuestion("What is the return type of the hashCode() method in the Object class?");
        question3.setOption1("Object");
        question3.setOption2("int");
        question3.setOption3("long");
        question3.setOption4("void");
        question3.setAnswer("int");
        list.add(question3);

        Question question4= new Question();
        question.setId(1);
        question4.setQuestion("Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?");
        question4.setOption1("javap tool");
        question4.setOption2("javaw command");
        question4.setOption3("Javadoc tool");
        question4.setOption4("javah command");
        question4.setAnswer("Javadoc tool");
        list.add(question4);

        Question question5= new Question();
        question.setId(1);
        question5.setQuestion("Which method of the Class.class is used to determine the name of a class represented by the class object as a String?");
        question5.setOption1("getClass()");
        question5.setOption2("intern()");
        question5.setOption3("getName()");
        question5.setOption4("toString()");
        question5.setAnswer("getName()");
        list.add(question5);

        Question question6= new Question();
        question.setId(1);
        question6.setQuestion("In which process, a local variable has the same name as one of the instance variables?");
        question6.setOption1("Serialization");
        question6.setOption2("Variable Shadowing");
        question6.setOption3("Abstraction");
        question6.setOption4("Multi-threading");
        question6.setAnswer("Variable Shadowing");
        list.add(question6);

        Question question7= new Question();
        question.setId(1);
        question7.setQuestion("An interface with no fields or methods is known as a ______.");
        question7.setOption1("Runnable Interface");
        question7.setOption2("Abstract Interface");
        question7.setOption3("Marker Interface");
        question7.setOption4("CharSequence Interface");
        question7.setAnswer("Marker Interface");
        list.add(question7);


        Question question8= new Question();
        question.setId(1);
        question8.setQuestion("Which option is false about the final keyword?");
        question8.setOption1("A final method cannot be overridden in its subclasses.");
        question8.setOption2("A final class cannot be extended.");
        question8.setOption3("A final class cannot extend other classes.");
        question8.setOption4("A final method can be inherited.");
        question8.setAnswer("A final class cannot extend other classes.");
        list.add(question8);

        Question question9= new Question();
        question.setId(1);
        question9.setQuestion("Evaluate the following Java expression, if x=3, y=5, and z=10: ++z + y - y + z + x++");
        question9.setOption1("24");
        question9.setOption2("23");
        question9.setOption3("20");
        question9.setOption4("25");
        question9.setAnswer("25");
        list.add(question9);

        Question question10= new Question();
        question.setId(1);
        question10.setQuestion("Which of these classes are the direct subclasses of the Throwable class?");
        question10.setOption1("Error and Exception class");
        question10.setOption2("RuntimeException and Error class");
        question10.setOption3("IOException and VirtualMachineError class");
        question10.setOption4("Exception and VirtualMachineError class");
        question10.setAnswer("Error and Exception class");
        list.add(question10);

        Question question11= new Question();
        question.setId(1);
        question11.setQuestion("In which memory a String is stored, when we create a string using new operator?");
        question11.setOption1("Stack");
        question11.setOption2("String memory");
        question11.setOption3("Heap memory");
        question11.setOption4("Random storage space");
        question11.setAnswer("Heap memory");
        list.add(question11);

        Question question12= new Question();
        question.setId(1);
        question12.setQuestion("Which of the following is a valid syntax to synchronize the HashMap?");
        question12.setOption1("Map m = hashMap.synchronizeMap();");
        question12.setOption2("HashMap map =hashMap.synchronizeMap();");
        question12.setOption3("Map m1 = Collections.synchronizedMap(hashMap);");
        question12.setOption4("None of these");
        question12.setAnswer("Map m1 = Collections.synchronizedMap(hashMap);");
        list.add(question12);

        Question question13= new Question();
        question.setId(1);
        question13.setQuestion("Which keyword is used for accessing the features of a package?");
        question13.setOption1("package");
        question13.setOption2("import");
        question13.setOption3("export");
        question13.setOption4("extends");
        question13.setAnswer("import");
        list.add(question13);

        Question question14= new Question();
        question.setId(1);
        question14.setQuestion("Which of the following is a reserved keyword in Java?");
        question14.setOption1("object");
        question14.setOption2("strictfp");
        question14.setOption3("main");
        question14.setOption4("system");
        question14.setAnswer("strictfp");
        list.add(question14);


        Collections.shuffle(list);
        return list;

    }
}
