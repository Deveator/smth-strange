package autotestsSet;

import org.testng.annotations.Test;

///import general.SetTestTheme;
import passwordCases.MaxLengthDigitSpCharsRequiredInPasswordNegative;
import passwordCases.MaxLengthDigitSpCharsRequiredInPasswordPositive;
import passwordCases.MaxLengthLettersSpCharsRequiredInPasswordNegative;
import passwordCases.MaxLengthLettersSpCharsRequiredInPasswordPositive;
import passwordCases.MaxLengthPasswordNegative;
import passwordCases.MaxLengthPasswordPositive;
import passwordCases.MaxLengthPasswordString_1;
import passwordCases.MaxLengthPasswordString_2;
import passwordCases.MinLengthDigitLetterRequiredInPasswordNegative;
import passwordCases.MinLengthDigitLetterRequiredInPasswordPositive;
import passwordCases.MinLengthPasswordNegative;
import passwordCases.MinLengthPasswordPositive;
import passwordCases.MinLengthPasswordString_1;
import passwordCases.MinLengthPasswordString_2;
import passwordCases.PasswordReqsPresence;
import passwordCases.RequireDigitInPasswordNegative;
import passwordCases.RequireDigitInPasswordPositive;
import passwordCases.RequireLetterInPasswordNegative;
import passwordCases.RequireLetterInPasswordPositive;
import passwordCases.RequireSpecCharsInPasswordNegative;
import passwordCases.RequireSpecCharsInPasswordPositive;

public class PasswordRequirementsTests {
	
	///@Test(priority = 0)
	///public void SetTestTheme_Test() {
	///	SetTestTheme.mSetTestTheme();
	///}
	
	@Test(priority = 1)
	public void PasswordReqsPresence_Test() {
		PasswordReqsPresence.mPasswordReqsPresence();
	}
	
	@Test(priority = 2)
	public void MinLengthPasswordString_1_Test() {
		MinLengthPasswordString_1.mMinLengthPasswordString_1();
	}
	
	@Test(priority = 3)
	public void MinLengthPasswordString_2_Test() {
		MinLengthPasswordString_2.mMinLengthPasswordString_2();
	}
	
	@Test(priority = 4)
	public void MaxLengthPasswordString_1_Test() {
		MaxLengthPasswordString_1.mMaxLengthPasswordString_1();
	}
	
	@Test(priority = 5)
	public void MaxLengthPasswordString_2_Test() {
		MaxLengthPasswordString_2.mMaxLengthPasswordString_2();
	}
	
	@Test(priority = 6)
	public void RequireLetterInPasswordNegative_Test() {
		RequireLetterInPasswordNegative.mRequireLetterInPasswordNegative();
	}
	
	@Test(priority = 7)
	public void RequireLetterInPasswordPositive_Test() {
		RequireLetterInPasswordPositive.mRequireLetterInPasswordPositive();
	}
	
	@Test(priority = 8)
	public void RequireDigitInPasswordNegative_Test() {
		RequireDigitInPasswordNegative.mRequireDigitInPasswordNegative();
	}
	
	@Test(priority = 9)
	public void RequireDigitInPasswordPositive_Test() {
		RequireDigitInPasswordPositive.mRequireDigitInPasswordPositive();
	}
	
	@Test(priority = 10)
	public void RequireSpecCharsInPasswordNegative_Test() {
		RequireSpecCharsInPasswordNegative.mRequireSpecCharsInPasswordNegative();
	}
	
	@Test(priority = 11)
	public void RequireSpecCharsInPasswordPositive_Test() {
		RequireSpecCharsInPasswordPositive.mRequireSpecCharsInPasswordPositive();
	}
	
	@Test(priority = 12)
	public void MaxLengthPasswordNegative_Test() {
		MaxLengthPasswordNegative.mMaxLengthPasswordNegative();
	}
	
	@Test(priority = 13)
	public void MaxLengthPasswordPositive_Test() {
		MaxLengthPasswordPositive.mMaxLengthPasswordPositive();
	}
	
	@Test(priority = 14)
	public void MinLengthPasswordNegative_Test() {
		MinLengthPasswordNegative.mMinLengthPasswordNegative();
	}
	
	@Test(priority = 15)
	public void MinLengthPasswordPositive_Test() {
		MinLengthPasswordPositive.mMinLengthPasswordPositive();
	}
	
	@Test(priority = 16)
	public void MaxLengthDigitSpCharsRequiredInPasswordNegative_Test() {
		MaxLengthDigitSpCharsRequiredInPasswordNegative.mMaxLengthDigitSpCharsRequiredInPasswordNegative();
	}
	
	@Test(priority = 16)
	public void MaxLengthDigitSpCharsRequiredInPasswordPositive_Test() {
		MaxLengthDigitSpCharsRequiredInPasswordPositive.mMaxLengthDigitSpCharsRequiredInPasswordPositive();
	}
	
	@Test(priority = 17)
	public void MaxLengthLettersSpCharsRequiredInPasswordNegative_Test() {
		MaxLengthLettersSpCharsRequiredInPasswordNegative.mMaxLengthLettersSpCharsRequiredInPasswordNegative();
	}
	
	@Test(priority = 18)
	public void MaxLengthLettersSpCharsRequiredInPasswordPositive_Test() {
		MaxLengthLettersSpCharsRequiredInPasswordPositive.mMaxLengthLettersSpCharsRequiredInPasswordPositive();
	}
	
	@Test(priority = 19)
	public void MinLengthDigitLetterRequiredInPasswordNegative_Test() {
		MinLengthDigitLetterRequiredInPasswordNegative.mMinLengthDigitLetterRequiredInPasswordNegative();
	}
	
	@Test(priority = 19)
	public void MinLengthDigitLetterRequiredInPasswordPositive_Test() {
		MinLengthDigitLetterRequiredInPasswordPositive.mMinLengthDigitLetterRequiredInPasswordPositive();
	}

}
