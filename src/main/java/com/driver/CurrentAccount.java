package com.driver;

public class CurrentAccount extends BankAccount{

    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
        super(name,balance,5000);
        this.tradeLicenseId=tradeLicenseId;
        if(getBalance()<getMinBalance()){
            throw new Exception("Insufficient Balan");
        }


    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception
        if(licenseIDUpper(this.tradeLicenseId) && licenseIDConsecutive(this.tradeLicenseId)){
            int n = tradeLicenseId.length();

            int[] count = new int[26];
            for(int i=0;i<n;i++){
                count[i]=0;
            }
            for(char ch: tradeLicenseId.toCharArray()){
                count[(int)ch-(int)'A']++;
            }

            char ch_max = getMaxCountChar(count);
            int maxCount = count[(int) ch_max - (int)'A'];

            if(maxCount >(n+1)/2){
                throw new Exception("Valid License can not be generated");
            }

            String res="";
            for (int i = 0; i < n; i++) {
                res += ' ';
            }

            int ind = 0;

            while (maxCount > 0) {
                res = res.substring(0, ind) + ch_max
                        + res.substring(ind + 1);
                ind = ind + 2;
                maxCount--;
            }
            count[(int)ch_max - (int)'A'] = 0;


            for (int i = 0; i < 26; i++) {
                while (count[i] > 0) {
                    ind = (ind >= n) ? 1 : ind;
                    res = res.substring(0, ind)
                            + (char)((int)'a' + i)
                            + res.substring(ind + 1);
                    ind += 2;
                    count[i]--;
                }
            }
            this.tradeLicenseId=res;

        }

    }

    public boolean licenseIDUpper(String id){

        int n= id.length();
        if(n==0)
            return false;
        boolean isUpper=false;
        for(int i=0;i<n;i++){
            if(id.charAt(i)>='A' && id.charAt(i)<='Z'){
                isUpper=true;
            }else{
                isUpper=false;
                break;
            }
        }
        return isUpper;
    }

    public boolean licenseIDConsecutive(String id){
        int n=id.length();
        boolean isConsecutive=false;
        for(int i=0;i<n-1;i++){
            if(id.charAt(i)==id.charAt(i+1)){
                isConsecutive=true;
                break;
            }else{
                isConsecutive=false;
            }
        }
        return isConsecutive;
    }

    public char getMaxCountChar(int[] count){
        int max=0;
        char ch=0;
        for(int i=0;i<26;i++){
            if(count[i]>max) {
                max = count[i];
                ch = (char)((int)'A'+i);
            }
        }
        return ch;
    }

    public String getTradeLicenseId() {
        return tradeLicenseId;
    }

    public void setTradeLicenseId(String tradeLicenseId) {
        this.tradeLicenseId = tradeLicenseId;
    }


}
