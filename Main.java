import java.util.Scanner;

class A
{
 int counter = 5;
 int subject, level;
 String name;
 Scanner scan = new Scanner(System.in);
 void name()
 {
  System.out.println(" What is your name?");
  name = scan.next();
  System.out.println(" Hi " + name + "!");
 }
}

class B extends A
{
 void difficulty()
 {
  System.out.println(" Would you like the quiz \n 1. EASY \n 2. HARD");
  level = scan.nextInt();
 }
}

class C extends B
{
 int score;
 int rans, wans;
 void subject()
 {
  System.out.println(" Which quiz do you want to do? \n 1. Mathematics \n 2. Technology");
  subject = scan.nextInt();
 }
 void questions()
 {
  System.out.println("\n ===============\n Good luck " + name + "!\n ===============");
  if (subject == 1)
  {
    if (level == 1)
    {
      System.out.println("\n Question no. 1: \n 5 * 5 / 5 \n Your answer:");
      int a1 = scan.nextInt();

      if (a1 == 5) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n Question no. 2: \n 64^0.5 - 4 + 4^2 \n Your answer:");
      int a2 = scan.nextInt();

      if (a2 == 20) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n Question no. 3: \n 50 - 13 + 22 \n Your answer:");
      int a3 = scan.nextInt();

      if (a3 == 59) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n Question no. 4: \n 19 * 3 + 8 \n Your answer:");
      int a4 = scan.nextInt();

      if (a4 == 65) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n Question no. 5: \n 56 / 8 * 7  \n Your answer:");
      int a5 = scan.nextInt();

      if (a5 == 49) { score += 10;  rans += 1;}
      else {score += 0; wans += 1;}

    }
    else if (level == 2)
    {
      System.out.println("\n Question no. 1: \n ((5^2) * 3) / 15 + 5 - 2 \n Your answer:");
      int a1 = scan.nextInt();

      if (a1 == 8) {score += 10;  rans += 1;}
      else {score -= 2; wans += 1;}

      System.out.println("\n Question no. 2: \n |(400^0.5)| + 12^2 * 3 \n Your answer:");
      int a2 = scan.nextInt();

      if (a2 ==  452) {score += 10; rans += 1;}
      else {score -= 2; wans += 1;}

      System.out.println("\n Question no. 3: \n 2230 + 13^2 * 2 \n Your answer:");
      int a3 = scan.nextInt();

      if (a3 == 2568) {score += 10; rans += 1;}
      else {score -= 2; wans += 1;}

      System.out.println("\n Question no. 4: \n 205 * 16^0.5 + 625 - 175 \n Your answer:");
      int a4 = scan.nextInt();

      if (a4 == 1270) {score += 10; rans += 1;}
      else {score -= 2; wans += 1;}

      System.out.println("\n Question no. 5: \n (((32 * 10) /  (20 * 16)) * 900^0.5)^2  \n Your answer:");
      int a5 = scan.nextInt();

      if (a5 == 900) {score += 10; rans += 1;}
      else {score -= 2; wans += 1;}

    }
  }
  else if (subject == 2)
  {
    if (level == 1)
    {
      System.out.println("\n Who founded Facebook? \n 1. Mark Zukerberg \n 2. Bill Gates \n Your answer:");
      int a1 = scan.nextInt();

      if(a1 == 1) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n Who is the CEO of Google? \n 1.Sheryl Sandberg \n 2.Sundar Pichai \n Your answer:");
      int a2 = scan.nextInt();

      if(a2 == 2) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n Where is Silicon Valley? \n 1. America \n 2. Austrailia \n Your answer:");
      int a3 = scan.nextInt();

      if(a3 == 1) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n What languauge is this quiz programmed in? \n 1. JavaScript \n 2. Java \n Your answer:");
      int a4 = scan.nextInt();

      if(a4 == 2) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n What is Java? \n 1. A type of coffee \n 2. A programming language \n 3. All of the above \n Your answer:");
      int a5 = scan.nextInt();

      if(a5 == 3) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

    }
    else if (level == 2)
    {
      System.out.println("\n What language is Linux based on? \n 1. C \n 2. JavaScript \n 3. Python \n 4. Swift \n Your answer:");
      int a1 = scan.next();

      if(a1 == 1) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n Who founded the Blu Ray disk storage format? \n 1. Microsoft \n 2. Google \n 3. Sony \n 4. Uber \n Your answer:");
      int a2 = scan.next();

      if(a2 == 3) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n Who is the CEO of Google? \n 1. Mark Zuckerberg  \n 2. Larry Page  \n 3. Sundar Pichai  \n 4. Sergey Brin \n Your answer:");
      int a3 = scan.next();

      if(a3 == 3) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n With respect to cryptography, what is Ceasar? \n 1. A salad dressing \n 2. A Roman ruler \n 3. A cipher \n 4. None of the above \n Your answer:");
      int a4 = scan.next();

      if(a4 == 3) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}

      System.out.println("\n What does EV stand for? \n 1. Extreme Variance \n 2. Engagement Variable \n 3. Electronic Variety \n 4. Electric Vehicle \n Your answer:");
      int a5 = scan.next();

      if(a5 == 4) {score += 10; rans += 1;}
      else {score += 0; wans += 1;}
    }
  }
  else {System.out.println("Done!");}
 }
}

class D extends C
{
 void total()
 {
  System.out.println("\n Your total score is "+ score + " out of 50");
  System.out.println(" Right answers: " + rans);
  System.out.println(" Wrong answers: " + wans);
 }
}

class Main
{
 public static void main(String args[])
 {
  D run_quiz = new D();

  run_quiz.name();
  run_quiz.difficulty();
  run_quiz.subject();
  run_quiz.questions();
  run_quiz.total();
 }
}
