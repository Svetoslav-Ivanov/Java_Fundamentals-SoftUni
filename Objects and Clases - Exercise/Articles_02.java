package Lab_ObjectsAndClases.Exercise_ObjectsAndClasses;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles_02 {

    static class Article {
        String title, content, author;

        public Article(String title, String content, String authorName) {
            this.title = title;
            this.content = content;
            this.author = authorName;
        }


        public String toString() {
            return String.format("%s - %s: %s", title, content, author);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int articlesCount = Integer.parseInt(scan.nextLine());
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < articlesCount; i++) {
            String[] articleAsArray = scan.nextLine().split(", ");
            Article article = new Article(articleAsArray[0], articleAsArray[1], articleAsArray[2]);
            articles.add(article);
        }

        String criteria = scan.nextLine();

        switch (criteria) {
            case "title":
                articles.sort(Comparator.comparing(a -> a.title));
                break;

            case "content":
                articles.sort(Comparator.comparing(a -> a.content));
                break;

            case "author":
                articles.sort(Comparator.comparing(a -> a.author));
                break;
        }

        for (Article article : articles) {
            System.out.println(article.toString());
        }

    }
}
