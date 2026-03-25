package com.lakshay;

import com.lakshay.basics.*;

import java.util.IntSummaryStatistics;

public class App {
    public static void main(String[] args) {
        System.out.println(CountVowels.count());
        System.out.println(CountWords.count());
        System.out.println(ReverseString.reverse());
        System.out.println(RemoveDuplicates.removeDuplicates());

//        basics
        System.out.println(CharacterFrequency.getFrequency());
        System.out.println(DuplicatesOnly.getChars());
        System.out.println(FirstNonRepeatedCharacter.getCharacter());
        System.out.println(MostFreqentElement.getMostFrequent());

        System.out.println(SquareOfEvenNumbers.getNumbers());
        System.out.println(LongestWord.getLongestString());
        System.out.println(FirstNonRepeatedWord.getWord());
        System.out.println(GroupByFirstChar.getVal());
        System.out.println(MaximumLengthStringByEachStartingChar.getMaxLenMapped());

        System.out.println(SumOfSquaresOfOddNumbers.getSum());
        System.out.println(TotalNumberOfCharactersAcrossAllWords.getCount());
        System.out.println(CountWordStartsWithChar.getCount());
        System.out.println(AverageLengthOfWordsGreaterThanFour.getCount());
        System.out.println(CountOfDistinctWordsGreaterThanThree.getCount());

        System.out.println(SecondLargest.findSecondLargest());
        System.out.println(DuplicateNumbers.getDuplicates());
        System.out.println(PartitionEvenAndOdd.partition());

//        summaryStatistics

        IntSummaryStatistics stats = new MaximumAndMinimumInOneStream().getMiniMaxi();
        System.out.println("mini : " + stats.getMin() + "  , maxi : " + stats.getMax());
        System.out.println(JoiningWithDelimiter.joinWithDelimiter());

        System.out.println(MaximumLengthWord.maxLengthWord());
        System.out.println(StringToUpperCase.convertToUpperCase());
        System.out.println(CountOccuranceOfEachWord.countOcc());
        System.out.println(CommonElementsBetweenTwoLists.getCommonElements());
        System.out.println(FlattenTwoDimensionList.flatList());



    }
}