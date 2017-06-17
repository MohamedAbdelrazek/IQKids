package com.graduation.project.IQInterviewKids.Data;

public class MyServerData {
    private static MyServerData myInstance = null;
    //test states: notStarted, inProgress, finished
    private static String testState = "notStarted";
    Question[] mIqQuestions;
    Question[] mInterviewQuestion;


    protected MyServerData() {
        //initialize questions from server, shared preferences, files etc.
        //questions are hardcoded here for testing
        mIqQuestions = new Question[48];
        mInterviewQuestion = new Question[27];
        String q = "What is the color of blood ?";
        String[] a = new String[4];
        Boolean[] r = new Boolean[4];
        a[0] = "Yellow";
        a[1] = "Black";
        a[2] = "Red";
        a[3] = "Blue";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        Question question = new Question(q, a, r);
        mIqQuestions[0] = question;

        q = "What are clothes made of?";
        a[0] = "Cloth";
        a[1] = "Paper";
        a[2] = "Wood";
        a[3] = "Glass";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[1] = question;

        q = "Which is the coldest?";
        a[0] = "Ice";
        a[1] = "Water";
        a[2] = "Rain";
        a[3] = "Glass";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[2] = question;
        q = "Which is used for making a hole?";
        a[0] = "Pliers";
        a[1] = "Hammer";
        a[2] = "Plane";
        a[3] = "Drill";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[3] = question;

        q = "Which can cause disease?";
        a[0] = "Bacteria";
        a[1] = "Baldness";
        a[2] = "Bones";
        a[3] = "Blood";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[4] = question;
        q = "Which is the longest snake?";
        a[0] = "Garter";
        a[1] = "Cobra";
        a[2] = "Rattle";
        a[3] = "Python";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[5] = question;
        q = "Which is most like a car?";
        a[0] = "Train";
        a[1] = "Truck";
        a[2] = "Plane";
        a[3] = "Boat";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[6] = question;
        q = "Which is not a fruit?";
        a[0] = "Mango";
        a[1] = "Grape";
        a[2] = "Tomato";
        a[3] = "Potato";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[7] = question;
        q = "Which has the sweetest taste?";
        a[0] = "Spaghetti";
        a[1] = "Hot dogs";
        a[2] = "Honey";
        a[3] = "Peanut Butter";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[8] = question;
        q = "Which did people invent first?";
        a[0] = "Boats";
        a[1] = "Cars";
        a[2] = "Airplanes";
        a[3] = "Trains";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[9] = question;
        q = "Which cannot go around the earth?";
        a[0] = "The moon";
        a[1] = "A boat";
        a[2] = "A plane";
        a[3] = "The Sun";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[10] = question;
        q = "Which lived first on Earth?";
        a[0] = "Monkeys";
        a[1] = "People";
        a[2] = "Dinosaurs";
        a[3] = "Birds";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[11] = question;
        q = "WWhich is most like a fork?";
        a[0] = "Spoon";
        a[1] = "Hammer";
        a[2] = "Pencil";
        a[3] = "Arrow";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[12] = question;
        q = "Which is most like a plate?";
        a[0] = "Board";
        a[1] = "Nail";
        a[2] = "Dish";
        a[3] = "Cup";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[13] = question;
        q = "How many legs does a cat have?";
        a[0] = "None";
        a[1] = "Two";
        a[2] = "Four";
        a[3] = "Many";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[14] = question;
        q = "How many feathers does a bird have?";
        a[0] = "None";
        a[1] = "Two";
        a[2] = "Four";
        a[3] = "Many";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[15] = question;
        q = "Which number is biggest?";
        a[0] = "Two";
        a[1] = "Ten";
        a[2] = "Twenty";
        a[3] = "Three";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[16] = question;
        q = "Which do you have the most of?";
        a[0] = "Ears";
        a[1] = "Eyes";
        a[2] = "Fingers";
        a[3] = "Legs";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[17] = question;
        q = "How much is two plus four?";
        a[0] = "Two";
        a[1] = "Six";
        a[2] = "Eight";
        a[3] = "Ten";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[18] = question;
        q = "If you have seven pennies and lose 3, how many do you have left?";
        a[0] = "None";
        a[1] = "Two";
        a[2] = "Four";
        a[3] = "Seven";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[19] = question;
        q = "If you eat six cherries and then eat eight more, how many have you eaten altogether?";
        a[0] = "6";
        a[1] = "8";
        a[2] = "12";
        a[3] = "14";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[20] = question;
        q = "How many things are in a dozen?";
        a[0] = "5";
        a[1] = "12";
        a[2] = "13";
        a[3] = "20";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[21] = question;
        q = "How many minutes are there in an hour?";
        a[0] = "12";
        a[1] = "5";
        a[2] = "30";
        a[3] = "60";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[22] = question;
        q = "How many days are there in a week?";
        a[0] = "5";
        a[1] = "6";
        a[2] = "7";
        a[3] = "10";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[23] = question;
        q = "How many seconds are in half a minute?";
        a[0] = "10";
        a[1] = "15";
        a[2] = "30";
        a[3] = "60";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[24] = question;
        q = "How many months are in a year?";
        a[0] = "7";
        a[1] = "8";
        a[2] = "10";
        a[3] = "12";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[25] = question;
        q = "If you have one dollar and buy two pieces of candy for 5 cents each, how much do you have left?";
        a[0] = "10 cents";
        a[1] = "50 cents";
        a[2] = "75 cents";
        a[3] = "90 cents";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[26] = question;
        q = "If you have 12 apples and share them equally with 4 friends, keeping none for yourself, how many apples will each friend get?";
        a[0] = "2";
        a[1] = "3";
        a[2] = "4";
        a[3] = "6";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[27] = question;
        q = "If you cut a pie into 4 pieces and then cut each of those in half, how many pieces will you have?";
        a[0] = "4";
        a[1] = "6";
        a[2] = "8";
        a[3] = "10";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[28] = question;
        q = "How much is 20 divided by 5?";
        a[0] = "4";
        a[1] = "5";
        a[2] = "6";
        a[3] = "10";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[29] = question;
        q = "Which means one half dollar?";
        a[0] = "$.25";
        a[1] = "50 p";
        a[2] = "$.50";
        a[3] = "$1.00";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[30] = question;
        q = "How much will you earn working eight hours at $2.00 per hour?";
        a[0] = "$4";
        a[1] = "$8";
        a[2] = "$16";
        a[3] = "$24";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[31] = question;
        q = "When she was sick, mother went to the?";
        a[0] = "Doctor";
        a[1] = "Store";
        a[2] = "School";
        a[3] = "Park";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[32] = question;
        q = "When the pet dog died, the family had a?";
        a[0] = "Party";
        a[1] = "Fight";
        a[2] = "Problem";
        a[3] = "Funeral";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[33] = question;
        q = "To pound a nail, you need a?";
        a[0] = "Pliers";
        a[1] = "Hammer";
        a[2] = "Scissors";
        a[3] = "Knife";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[34] = question;
        q = "To make a salad, mother bought?";
        a[0] = "Hamburger";
        a[1] = "Bread";
        a[2] = "Milk";
        a[3] = "Lettuce";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[35] = question;

        q = "To write a sentence, you need?";
        a[0] = "Words";
        a[1] = "A book";
        a[2] = "A chair";
        a[3] = "A desk";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[36] = question;
        q = "To fill a bicycle tire you need a?";
        a[0] = "Dollar";
        a[1] = "Jar";
        a[2] = "Pump";
        a[3] = "Gasoline";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[37] = question;
        q = "When she lost her doll, the girl felt?";
        a[0] = "Happy";
        a[1] = "Tired";
        a[2] = "Hungry";
        a[3] = "Sad";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[38] = question;

        q = "A light bulb makes light by using?";
        a[0] = "Fire";
        a[1] = "Electricity";
        a[2] = "Water";
        a[3] = "A match";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[39] = question;

        q = "To get stronger, people lift?";
        a[0] = "Groceries";
        a[1] = "Boards";
        a[2] = "Toys";
        a[3] = "Weights";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[40] = question;

        q = "To make people laugh, you tell a?";
        a[0] = "Joke";
        a[1] = "talk";
        a[2] = "lie";
        a[3] = "Song";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[41] = question;

        q = "To learn about things long ago, we study?";
        a[0] = "People";
        a[1] = "History";
        a[2] = "Mountains";
        a[3] = "Oceans";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[42] = question;

        q = "Water is:";
        a[0] = "Wet";
        a[1] = "Dry";
        a[2] = "Wood";
        a[3] = "Sticky";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[43] = question;

        q = "Ice cream is?";
        a[0] = "Hot";
        a[1] = "Breakfast";
        a[2] = "Sweet";
        a[3] = "Big";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mIqQuestions[44] = question;

        q = "A dog is a?";
        a[0] = "Cat";
        a[1] = "Pet";
        a[2] = "Tail";
        a[3] = "Tooth";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[45] = question;


        q = "We see with our?";
        a[0] = "Nose";
        a[1] = "Mouth";
        a[2] = "Eyes";
        a[3] = "Ears";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[46] = question;

        q = "A board is made of?";
        a[0] = "Wood";
        a[1] = "Metal";
        a[2] = "Glass";
        a[3] = "Plastic";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mIqQuestions[47] = question;
        //----------------------------------------------------------------------------------
        q = "ماهو ناتج الجمع التالي 500+60+9 ؟";
        a[0] = "569";
        a[1] = "567";
        a[2] = "550";
        a[3] = "100";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[0] = question;
        q = "ما هو ناتج الجمع التالي 500+40+10 ؟";
        a[0] = "569";
        a[1] = "567";
        a[2] = "550";
        a[3] = "100";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[1] = question;

        q = "ما ناتج الجمع التالي 50+55+20";
        a[0] = "100";
        a[1] = "150";
        a[2] = "125";
        a[3] = "115";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[2] = question;

        q = "ما ناتج الجمع التالي 30+20+30";
        a[0] = "85";
        a[1] = "80";
        a[2] = "70";
        a[3] = "75";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[3] = question;

        q = " ما ناتج الجمع التالي 20+20+10";
        a[0] = "50";
        a[1] = "45";
        a[2] = "49";
        a[3] = "60";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[4] = question;

        q = "ما ناتج الجمع التالي30+5";
        a[0] = "30";
        a[1] = "35";
        a[2] = "25";
        a[3] = "40";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[5] = question;
        q = "ما ناتج الجمع التالي30+43+12+5";
        a[0] = "120";
        a[1] = "80";
        a[2] = "132";
        a[3] = "90";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mInterviewQuestion[6] = question;
        q = "قم بتركيب الكلمات التالية في جملة مفيدة:- بابا , السوق,ذهب, الى";
        a[0] = "بابا الى السوق ذهب";
        a[1] = "ذهب بابا الى السوق";
        a[2] = "السوق بابا الى ذهب";
        a[3] = "السوق ذهب بابا الي";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[7] = question;

        q = "قم بتركيب الكلمات التالية في جملة مفيدة:- كرة ,يلعب ,قدم , احمد";
        a[0] = "يلعب احمد كرة القدم";
        a[1] = "كرة القدم يلعب احمد";
        a[2] = "احمد كرة القدم يلعب";
        a[3] = "احمد كرة القدم يلعب";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[8] = question;

        q = "قم بتركيب الكلمات التالية في جملة مفيدة:- كل, يزرع,ارضه,الفلاح,عام";
        a[0] = "ارضه الفلاح يزرع كل عام";
        a[1] = "كل عام يزرع الفلاح ارضه";
        a[2] = "يزرع الفلاح ارضه كل عام";
        a[3] = "عام كل يزرع الفلام ارضه";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[9] = question;

        q = "قم بتركيب الكلمات التالية في جملة مفيدة:- تشرق ,اشراقا, كل , الشمس, صباح,جميلا";
        a[0] = "تشرق الشمس اشراقا جميلاكل صباح";
        a[1] = "كل صباح تشرق الشمس اشراقا جميلا";
        a[2] = "اشراقا جميلا تشرق الشمسس كل صباح";
        a[3] = "الشمس تشرق كل صباح جميلا اشراقا ";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[10] = question;

        q = " قم بتركيب الكلمات التالية في جملة مفيدة:- انا ,الرصيف, اسير ,على";
        a[0] = "اسير انا على الرصيف";
        a[1] = "انا على الرصيف اسير";
        a[2] = "انا اسير على الرصيف";
        a[3] = "الرصيف اسير علي انا";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[11] = question;

        q = "اي من التالبة من اقسام البذرة";
        a[0] = "قشرة";
        a[1] = "نواة";
        a[2] = "ماء";
        a[3] = "عصير";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[12] = question;

        q = "أي من المنتوجات الموجودة امامك غير مصنوعة من النباتات";
        a[0] = "طاولة خشب";
        a[1] = "خبز";
        a[2] = "طنجرة";
        a[3] = "مكتب";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[13] = question;

        q = "يعتبر الثعلب من ؟";
        a[0] = "الطيور";
        a[1] = "برمائيات";
        a[2] = "ألزواحف";
        a[3] = "الثديات";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mInterviewQuestion[14] = question;

        q = "يعتبرالحمام من";
        a[0] = "الطيور";
        a[1] = "برمائيات";
        a[2] = "ألزواحف";
        a[3] = "الثديات";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[15] = question;

        q = "يعتبر الضفدع من ";
        a[0] = "الثديات";
        a[1] = "البرمائيات";
        a[2] = "الطيور";
        a[2] = "ألزواحف";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[16] = question;

        q = "اي من المعادلات التالية تعطي ناتج 3؟";
        a[0] = "10-7";
        a[1] = "6-2";
        a[2] = "5-4";
        a[3] = "120-17";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[17] = question;
        q = "اي من المعادلات التالية تعطي ناتج 103؟";
        a[0] = "10-7";
        a[1] = "6-2";
        a[2] = "5-4";
        a[3] = "120-17";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mInterviewQuestion[18] = question;

        q = "اي من المعادلات التالية تعطي ناتج 10";
        a[0] = "20-9";
        a[1] = "10-5";
        a[2] = "100-90";
        a[3] = "100-10";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[19] = question;

        q = "اي من المعادلات التالية تعطي ناتج 18";
        a[0] = "20-9";
        a[1] = "18-5";
        a[2] = "100-90";
        a[3] = "100-88";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mInterviewQuestion[20] = question;

        q = "اي من المعادلات التالية تعطي ناتج 501";
        a[0] = "20-9";
        a[1] = "502-1";
        a[2] = "100-90";
        a[3] = "100-10";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[21] = question;

        q = "اي من المعادلات التالية تعطي ناتج 12؟";
        a[0] = "15-6";
        a[1] = "15-4";
        a[2] = "20-14";
        a[3] = "15-3";
        r[0] = false;
        r[1] = false;
        r[2] = false;
        r[3] = true;
        question = new Question(q, a, r);
        mInterviewQuestion[22] = question;
        q = "اي من المعادلات التالية تعطي ناتج 15؟";
        a[0] = "30-15";
        a[1] = "15-4";
        a[2] = "20-14";
        a[3] = "15-3";
        r[0] = true;
        r[1] = false;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[23] = question;
        q = "اي من المعادلات التالية تعطي ناتج 8؟";
        a[0] = "30-15";
        a[1] = "15-4";
        a[2] = "15-7";
        a[3] = "15-3";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[24] = question;

        q = "اي من المعادلات التالية تعطي ناتج 18؟";
        a[0] = "30-15";
        a[1] = "15-4";
        a[2] = "25-7";
        a[3] = "15-3";
        r[0] = false;
        r[1] = false;
        r[2] = true;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[25] = question;
        q = "اي من المعادلات التالية تعطي ناتج 11؟";
        a[0] = "30-15";
        a[1] = "15-4";
        a[2] = "15-7";
        a[3] = "15-3";
        r[0] = false;
        r[1] = true;
        r[2] = false;
        r[3] = false;
        question = new Question(q, a, r);
        mInterviewQuestion[26] = question;


    }

    public static synchronized MyServerData getInstance() {
        if (myInstance == null) {
            myInstance = new MyServerData();
        }
        return myInstance;

    }

    public String getTestState() {
        return testState;
    }

    public void setTestState(String testState) {
        MyServerData.testState = testState;
    }

    public Question[] getAllIqQuestions() {
        return mIqQuestions;
    }

    public Question[] getAllInterviewQuestions() {
        return mInterviewQuestion;
    }


    public int getTotalNumberIqQuestions() {
        return mIqQuestions.length;
    }

    public int getTotalNumberInterviewQuestions() {
        return mInterviewQuestion.length;
    }

    public Question getIqQuestionNumber(int questionNumber) {

        return mIqQuestions[questionNumber];
    }

    public Question getInterviewQuestionNumber(int questionNumber) {
        if (questionNumber > 26)
            return mInterviewQuestion[1];
        return mInterviewQuestion[questionNumber];
    }

    public void clearAnswers() {
        for (int i = 0; i < mIqQuestions.length; i++) {
            mIqQuestions[i].resetChecked();
        }
        for (int i = 0; i < mInterviewQuestion.length; i++) {
            mInterviewQuestion[i].resetChecked();
        }

    }
}