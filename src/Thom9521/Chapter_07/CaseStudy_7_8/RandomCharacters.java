package Thom9521.Chapter_07.CaseStudy_7_8;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class RandomCharacters {



        public static char getRandomCharacter(char ch1, char ch2) {
            return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
        }


        public static char getRandomLowerCaseLetter() {
            return getRandomCharacter('a', 'z');
        }
    }

