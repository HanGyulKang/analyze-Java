package theJavaCodeManipulation.example;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {

    public static void main(String[] args) throws IOException {
//        ClassLoader classLoader = Masulsa.class.getClassLoader();
//        TypePool typePool = TypePool.Default.of(classLoader);
//
//        new ByteBuddy().redefine(
//                        typePool.describe("theJavaCodeManipulation.example.Moja").resolve(),
//                        ClassFileLocator.ForClassLoader.of(classLoader))
//                .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                .make().saveIn(new File("C:\\study\\analyze-Java\\target\\classes"));

        System.out.println(new Moja().pullOut());
    }
}
