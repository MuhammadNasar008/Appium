package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "invalid-number")
    public static Object[][] invalidNumber() {
        return new Object[][]{{"0096659123"}, {"9665912345"}, {"+66591234"}, {"051234567"}, {"+5123456789"},{"521234567"}};
    }

    @DataProvider(name = "non-registered-number")
    public static Object[][] nonRegisteredNumber() {
        return new Object[][]{{"590123456"}, {"0591234567"}, {"00966590012348"}, {"966590001238"}, {"+966590111238"}, {"580123456"}, {"0581234567"}, {"00966580012348"}, {"966580001238"}, {"+966580111238"}};
    }

    @DataProvider(name = "non-registered-email")
    public static Object[][] nonRegisteredEmail() {
        return new Object[][]{{"sa1@test.com"}, {"sa2@test.com"}, {"test@test.com"}};
    }

    @DataProvider(name = "invalid-email")
    public static Object[][] invalidEmail() {
        return new Object[][]{{"testtest.com"}, {"testtestcom"}, {"test.test@com "}, {"test@test.com.lb"}, {"test@test"}, {"test12@test12.com"}};
    }

    @DataProvider(name = "login-number")
    public static Object[][] loginNumber() {
        return new Object[][]{{"0597654321"}, {"592345678"}, {"966595678901"}, {"00966593456789"}, {"+966590123456"}};
    }
    
    @DataProvider(name = "login-number2")
    public static Object[][] loginNumber2() {
        return new Object[][]{{"00966581234567"},{"966581234567"},{"+966581234567"},{"0581234567"},{"581234567"}};
    }
    
    @DataProvider(name = "login-number3")
    public static Object[][] loginNumber3() {
        return new Object[][]{{"571234567"},{"561234567"},{"541234567"},{"551234567"},{"531234567"},{"501234567"},{"511234567"}};
    }

    @DataProvider(name = "login-email")
    public static Object[][] loginEmail() {
        return new Object[][]{{"s@test.com"}, {"s1@test.com"}};
    }
    
    @DataProvider(name = "valid-registered-number")
    public static Object[][] validRegisteredNumber() {
        return new Object[][]{{"571234567"},{"561234567"},{"541234567"},{"551234567"},{"531234567"},{"501234567"},{"511234567"},{"+966581234567"},{"0581234567"},{"581234567"}};
    }
    
    @DataProvider(name = "unregistered-number")
    public static Object[][] unRegisteredNumber() {
        return new Object[][]{{"0096659"},{"96659"},{"+96659"},{"059"},{"59"},{"0096658"},{"96658"}};
    }
    
    @DataProvider(name = "valid-postpaid-number")
    public static Object[][] validPostPaidNumber() {
        return new Object[][]{{"594218720"},{"0594218720"}};
    }
    
    @DataProvider(name = "valid-prepaid-number")
    public static Object[][] validPrepaidNumber() {
        return new Object[][]{{"594219311"},{"0594219311"}};
    }
    
    @DataProvider(name = "card-Details-Fields")
    public static Object[][] cardDetailsField() {
        return new Object[][]{{"Card Number"},{"Card Holder Name"},{"Expiry Date"},{"CVV"}};
    }
    
    
    @DataProvider(name = "invalid-fiber-number")
    public static Object[][] invalidFiberNumber() {
        return new Object[][]{{"12345678"},{"0123456789"},{"123456"}};
    }
    
    @DataProvider(name = "success-screen-prepaid-numbers")
    public static Object[][] successScreenPrepaidNumbers() {
        return new Object[][]{{"Recharge balance pre-defined amount"},{"Recharge balance custom amount"},{"Recharge balance pre-defined amount for prepaid data line number"},{"Recharge balance custom amount for prepaid data line number"}};
    }
    
    @DataProvider(name = "pay-with-card")
    public static Object[][] payWithCardScrenDesign() {
        return new Object[][]{{"Voice Line Prepaid Number"},{"Recharge balance custom amount"},{"Recharge Data"}};
    }
    
    @DataProvider(name = "failed-Transaction-Screen")
    public static Object[][] failedTransactionScreen() {
        return new Object[][]{{"Voice Line Postpaid Number"},{"Voice Line Prepaid Number"}};
        }
    
    @DataProvider(name = "pay-With-Card-PostPaid")
    public static Object[][] payWithCardPostPaidOption() {
        return new Object[][]{{"Postpaid Voice Line Number"},{"Postpaid Data Line Number"},{"Postpaid Fiber Line Number"}};
        }
    
    @DataProvider(name = "prepaid-Number-Screen-Designs")
    public static Object[][] prePaidNumbersScreenDesign() {
        return new Object[][]{{"Prepaid Voice Line Number"},{"Prepaid Data Line Number"}};
        }
    
    @DataProvider(name = "transaction-Failed")
    public static Object[][] transactionFailed() {
        return new Object[][]{{"Prepaid Voice Line Number"},{"Postpaid Voice Line Number"},{"Prepaid Data Line Number"},{"Postpaid Data Line Number"},{"Postpaid Fiber Line Number"}};
        }
    
    @DataProvider(name = "pay-Without-Entering-Value")
    public static Object[][] payWithoutEnteringValue() {
        return new Object[][]{{"Pay without entering value for Postpaid Voice Line Number"},{"Enter zero amount and pay for Postpaid Voice Line Number"},{"Pay without entering value for Postpaid Data Line Number"},{"Enter zero amount and pay for Postpaid Data Line Number"},{"Pay without entering value for Postpaid Fiber Line Number"},{"Enter zero amount and pay for Postpaid Fiber Line Number"}};
        }
    
    @DataProvider(name = "decimal-Amount")
    public static Object[][] decimalAmountNotAllowedCases() {
        return new Object[][]{{"Postpaid Voice Line Number"},{"Postpaid Data Line Number"},{"Postpaid Fiber Line Number"}};
        }
    
    @DataProvider(name = "decimal-Number-Not-Allowed-TestCases")
    public static Object[][] prePaidNumbersScreen() {
        return new Object[][]{{"C26976"},{"C27002"},{"C27022"}};
        }
    
    @DataProvider(name = "missing-Data-Validation-Message")
    public static Object[][] missingDataValidationMessages() {
        return new Object[][]{{"C26980"},{"C27257"},{"C27287"},{"C27028"}};
        }
    
    @DataProvider(name = "missing-Data-Validation-Message-Card-Number")
    public static Object[][] missingDataValidationMessagesForCardNumber() {
        return new Object[][]{{"C26981"},{"C27258"},{"C27246"},{"C27288"},{"C27236"}};
        }
    
    @DataProvider(name = "missing-Data-Validation-Message-Card-Holder-Name")
    public static Object[][] missingDataValidationMessagesForCardHolderName() {
        return new Object[][]{{"C26982"},{"C27259"},{"C27247"},{"C27289"},{"C27237"}};
        }
    
    @DataProvider(name = "missing-Data-Validation-Message-Expiry-Date")
    public static Object[][] missingDataValidationMessagesForExpiryDate() {
        return new Object[][]{{"C26983"},{"C27260"},{"C27248"},{"C27290"},{"C27238"}};
        }
    
    @DataProvider(name = "missing-Data-Validation-Message-CVV")
    public static Object[][] missingDataValidationMessagesForCVV() {
        return new Object[][]{{"C26984"},{"C27261"},{"C27249"},{"C27291"},{"C27239"}};
        }
    
    @DataProvider(name = "incomplete-Number-Message")
    public static Object[][] incompleteNumberMessage() {
        return new Object[][]{{"C26985"},{"C27262"},{"C27250"},{"C27292"},{"C27240"}};
        }
    
    @DataProvider(name = "card-Not-Supported-Number-Message")
    public static Object[][] cardNotSupportedErrorMessage() {
        return new Object[][]{{"C26986"},{"C272663"},{"C27251"},{"C27293"},{"C27241"}};
        }
    
    @DataProvider(name = "transaction-Failed-Error-Message")
    public static Object[][] transactionFailedErrorMessage() {
        return new Object[][]{{"C26989"},{"C27264"},{"C27252"},{"C27294"},{"C27242"}};
        }
    
    @DataProvider(name = "recharge-voucher-Empty-Field-Validation")
    public static Object[][] rechargeVoucherEmptyFieldValidation() {
        return new Object[][]{{"C27225"},{"C27281"}};
        }
    
    @DataProvider(name = "invalid-Voucher-Number-Validation")
    public static Object[][] invalidVoucherFieldValidation() {
        return new Object[][]{{"C27226"},{"C27282"}};
        }
    
    @DataProvider(name = "greater-Than-Fourteen-Digits-Voucher-Number-Validation")
    public static Object[][] greaterThan14DigitsVoucherNumber() {
        return new Object[][]{{"C27227"},{"C27283"}};
        }
    
    @DataProvider(name = "success-Screen-Voucher-Number")
    public static Object[][] successRechargeVoucherNumber() {
        return new Object[][]{{"C27228"},{"C27284"}};
        }
    
    @DataProvider(name = "recharge-Failed-Voucher-Number")
    public static Object[][] rechargeFailedVoucherNumber() {
        return new Object[][]{{"C27229"},{"C27285"}};
        }
    
    @DataProvider(name = "fiber-Number-Validation")
    public static Object[][] fiberNumberValidationMessages() {
		return new Object[][] {{"C26969"},{"C26970"},{"C26971"},{"C26973"},{"C26972"},{"C27026"}};
        }
    /////
    @DataProvider(name = "Amount-Validation")
    public static Object[][] fiberNumberValidationAmount() {
		return new Object[][] {{"C27025"},{"C27024"},{"C27023"},{"C27026"}};
        }
    
    @DataProvider(name = "Enter-Number-Validation")
    public static Object[][] fiberNumberValidation() {
		return new Object[][] {{"C26969"},{"C26970"},{"C26971"},{"C26973"},{"C26972"}};
        }
    
    @DataProvider(name = "data-Number-Validation")
    public static Object[][] DataLineNumberValidation() {
		return new Object[][] {{"C26962"},{"C26963"},{"C26964"},{"C26965"},{"C26966"},{"C26967"},{"C26968"}};
        }
    
    @DataProvider(name = "dataandvoiceline-Number-Validation")
    public static Object[][] DataANDVoiceLineNumberValidation() {
		return new Object[][] {{"C27006"},{"C27005"},{"C27004"},{"C27003"},{"C27277"},{"C27278"},{"C27280"},{"C27275"},{"C27273"},{"C27272"},{"C27271"},{"C27270"},{"C27269"},{"C27232"},{"C27230"},{"C26997"},{"C26996"},{"C26995"},{"C26994"},{"C26988"},{"C26987"},{"C26977"},{"C26978"},{"C26998"},{"C27234"},{"C27224"}};
        }
    
    @DataProvider(name = "PageDesignUI-Validation")
    public static Object[][] PageDesignUIValidation() {
		return new Object[][] {{"C27256"},{"C27286"},{"C27027"},{"C27019"},{"C27268"},{"C27007"},{"C26999"},{"C26847"},{"C26979"},{"C26846"}};
        }
    
    

}

