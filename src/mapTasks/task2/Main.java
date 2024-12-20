package mapTasks.task2;

import org.w3c.dom.css.Counter;

import java.util.HashMap;
import java.util.Map;

import static mapTasks.task2.LanguageCounter.langCounter;

public class Main {
    public static void main(String[] args) {
        String[] languages = new String[] {
                "Java", "Go", "PHP", "Js", "C#", "Python", "Ruby", "Swift", "C++", "Kotlin",
                "Java", "Go", "PHP", "Js", "JavaScript", "C", "Rust", "Perl", "TypeScript", "Scala",
                "Haskell", "Elixir", "Lua", "Swift", "Java", "Go", "C#", "PHP", "Ruby", "C++",
                "Kotlin", "Rust", "Python", "JavaScript", "Go", "Swift", "Ruby", "PHP", "Java", "C#",
                "Perl", "TypeScript", "Scala", "Haskell", "C", "Lua", "Elixir", "Go", "Java", "Ruby",
                "C#", "Swift", "JavaScript", "Python", "Rust", "Perl", "C++", "PHP", "Go", "Java",
                "Lua", "Kotlin", "Ruby", "Python", "Go", "Java", "Swift", "C#", "JavaScript", "C++",
                "Perl", "Haskell", "TypeScript", "Scala", "Rust", "Kotlin", "Ruby", "Java", "Go",
                "PHP", "Swift", "C#", "JavaScript", "Python", "C", "Rust", "Lua", "Perl", "Go",
                "Java", "Python", "Kotlin", "Ruby", "JavaScript", "C#", "Swift", "C++", "TypeScript", "Scala"
        };

        System.out.println(langCounter(languages));
    }


}
