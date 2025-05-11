import _6_Backtracing.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        String word1= "bxjegbjccjjxfnsi", word2= "earbsgsofyw";
//        char[] ch1 = word1.toCharArray();
//        char[] ch2 = word2.toCharArray();
//        int n1 = ch1.length, n2 = ch2.length, i=0, j=0, flag=0, k = 0;
//        String mergedString = "";
//
//        if(n1 == n2) {
//            k =n1+n2;
//        } else{
//            k = Integer.max(n1, n2);
//        }
//        while(i< n1 && j< n2 && flag <= k) {
//            if(flag %2 == 0 && i<n1) {
//                mergedString += ch1[i];
//                i++; flag++;
//            } else {
//                mergedString += ch2[j];
//                j++; flag++;
//            }
//
//        }
//        while(i< n1) {
//            mergedString += ch1[i];
//            i++;
//        }
//        while(j <  n2) {
//            mergedString += ch2[j];
//            j++;
//        }
//
//        System.out.println(mergedString);
//
//        int k = 1;
//        int n = nums.length;
//        double maxAvg = 0.0;
//        for(int i = 0 ; i < nums.length - k +1; i++) {
//            double sum =0;
//            for(int j=i; j<i+k; j++) {
//                sum += nums[j];
//            }
//            sum= sum/(double)k;
////            if(sum >k) {
////                sum= sum/(double)k;
////            }
//
//            if(maxAvg < sum) {
//                maxAvg = sum;
//            }
//
//        }


//        String s ="QQWE";
//        Map<Character, Integer> map = new HashMap<>();
//        char[] ch = s.toCharArray();
//        for(char c : ch) {
//            if(map.get(c) == null) {
//                map.put(c, 1);
//            } else {
//                map.put(c, map.get(c) +1);
//            }
//        }
//
//        int diff =  s.length() / 4;
//        int sum = 0;
//        for(int value : map.values()) {
//            if(value < diff) {
//                sum +=  diff - value;
//            }
//        }
//        System.out.println(sum);


//        // Problem : given a deck of card, have to pick the card k with max number
//        // cards can be picked from front or back not middle
//        int[] arr =  {6, 2, 3, 4, 7, 2,1, 7, 1};
//        int k = 4;
//        int leftSum = 0, rightSum = 0, maxSum = 0;
//        for(int  i = 0; i < k; i++) {
//            leftSum += arr[i];
//        }
//        maxSum = Integer.max(maxSum, leftSum +rightSum);
//        int right = arr.length -1;
//        for(int i = k - 1 ; i >= 0 ; i--) {
//            leftSum = leftSum - arr[i];
//            rightSum += arr[right];
//            right--;
//            maxSum = Integer.max(maxSum, leftSum +rightSum);
//        }
//        System.out.println(maxSum);


        // Problem longest substring without repeating character

//        String s = "cadbzabcd";
//        char[] ch = s.toCharArray();
//        int max = 0;

//        for(int i =0 ; i< ch.length; i++) {
//            String substring = "";
//            for (int j = i; j <ch.length; j++) {
//                if(!substring.contains(Character.toString(ch[j]))) {
//                    substring = substring+ ch[j];
//                    max = Integer.max(max, substring.length());
//                } else {
//                    break;
//                }
//            }
//        }

        // optimal solution ++
//        String s = "11100011110";
//        Set<Character> charSet = new HashSet<>();
//        int left = 0, right = 0;
//        int maxLength = 0;
//        String longestSubstring = "";
//
//        while(right < s.length()) {
//            char rightChar = s.charAt(right);
//            if(!charSet.contains(rightChar)) {
//                charSet.add(rightChar);
//                right++;
//
//                if(right - left > maxLength) {
//                    maxLength = right -left;
//                    longestSubstring = s.substring(left, right);
//                }
//            } else {
//                char leftChar = s.charAt(left);
//                charSet.remove(leftChar);
//                left++;
//            }
//        }
//        System.out.println(longestSubstring);

//

//        LongestSubstringAtmostKDistinctCharacters lg = new LongestSubstringAtmostKDistinctCharacters();
//        System.out.println(lg.longestSubString());

//        NoOfSubStringContaining3Character lg = new NoOfSubStringContaining3Character();
//        System.out.println(lg.noOfSubstring());

//        LongestPalindrome lp = new LongestPalindrome();
//        lp.printLongestPalindrome();

//        char[] chars = {'a','a','b','b','c','c','c'};
//
//        char ch = chars[0];
//        int count = 0;
//        String str = String.valueOf(ch);
//        for(char c : chars) {
//            if(ch == c) {
//                count++;
//            } else {
//                if(count != 0) {
//                    str += String.valueOf(count);
//                }
//                ch = c;
//                str += String.valueOf(c);
//                count = 1;
//            }
//        }
//        if(count != 1) {
//            str += String.valueOf(count);
//        }
//        chars = str.toCharArray();

//        int[] nums = {7,36,96,70,85,23,5,18,4,12,89,92,9,30,53,14,96,32,13,43,37,60,75,7,83,68,20,8,-24,-80,-27,-92,-96,-20,-16,-52,-49,-38};
//        long sum = 1;
//        for(int i =0 ; i < nums.length ; i++) {
//            if(nums[i] == 0){
//                System.out.println(0);
//            }
//            sum *= nums[i];
//        }
//        if(sum > 0) {
//            System.out.println(1);
//        } else {
//            System.out.println(-1);
//        }
//        char[] ch = {'a'};

//        int[] nums = {2};
//        int val =2;
//
//        int i = 0, j = i, count = 0;
//        while(j < nums.length -1) {
//            if(nums[j] ==  val) {
//
//                while(j < nums.length - 1) {
//                    if(nums[j] ==val) j++;
//                    else {
//                        int tem = nums[i];
//                        nums[i] = nums[j];
//                        nums[j] = tem;
//
//                        i++;
//                        j = i;
//                        count++;
//                    }
//
//                }
//
//            } else {
//                i++;
//                j++;
//            }
//        }
//        System.out.println(nums.length - count);

//        String s = "A man, a plan, a canal: Panama";
//        StringBuilder str = new StringBuilder();
//        str.to
//        for(int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(Character.isDigit(ch) || Character.isAlphabetic(ch)) {
//
//                str.append(ch);
//            }
//        }
//        String rev = str.toString();
//        rev = rev.
//        int j = 0, k = rev.length() -1;
//        while (j < k) {
//            if(rev.charAt(j) != rev.charAt(k)) {
//                return;
//            }
//            j++;
//            k--;
//        }

//        int[] nums = {7,1,5,3};
////        int buy = prices[0], profix = 0;
//        int[][] accounts  = {{1,2,3},{3,2,1}};
//        int rich = 0;
//        for(int i= 0; i < accounts.length ; i++) {
//            int sum = 0;
//            for(int j = 0; j <= accounts.length;  j++) {
//                sum += accounts[i][j];
//            }
//            rich = Integer.max(rich, sum);
//        }

//        int[] nums = {3,4,-1,1};
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
//                // Swap nums[i] with nums[nums[i] - 1]
//                int correctIndex = nums[i] - 1;
//                int temp = nums[i];
//                nums[i] = nums[correctIndex];
//                nums[correctIndex] = temp;
//            }
//        }

//        String num1 = "6913259244";
//        String num2 = "71103343";
//        int i = 0, j= 0;
//        int r1 = 0, r2 = 0;
//        char ch;
//        while(i < num1.length() && j < num2.length()) {
//            if(i <  num1.length()) {
//                ch = num1.charAt(i);
//                r1 = r1 * 10 + (ch - '0') ;
//                i++;
//            }
//            if(j <  num2.length()) {
//                ch = num2.charAt(j);
//                r2 = r2 * 10 + (ch - '0') ;
//                j++;
//            }
//        }
//
//
//        System.out.println((float)r1  * r2);
//        Set<Integer> distint =  new HashSet<>();
//
//        TopKFrequentElement k = new TopKFrequentElement();
//        k.optimalApproach(new int[]{1, 1, 1, 2, 2, 3}, 2);
//        ValidSudoku s = new ValidSudoku();
//        s.isSudokoValid(new char[][]{
//                {'1','2','.','.','3','.','.','.','.'},
//                {'4','.','.','5','.','.','.','.','.'},
//                {'.','9','8','.','.','.','.','.','3'},
//                {'5','.','.','.','6','.','.','.','4'},
//                {'.','.','.','8','.','3','.','.','5'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','.','.','.','.','.','2','.','.'},
//                {'.','.','.','4','1','9','.','.','8'},
//                {'.','.','.','.','8','.','.','7','9'}});

//        ThreeSum sum = new ThreeSum();
//        sum.optimalApproach(new int[]{-2,0,1,1,2});

//        RainWaterTrap r = new RainWaterTrap();
//        r.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
//        DailyTemperatures dt = new DailyTemperatures();
//        dt.dailyTemperatures(new int[]{30,38,30,36,35,40,28});

//        LargestRectangle lr = new LargestRectangle();
//        lr.largestRectangleArea(new int[]{2,1,5,6,2,3});

//        int[][] matrix = {{1},{3}};
//        int n = matrix.length, target =3;
//        boolean res;
//        for(int i =0 ; i < n; i++) {
//            int j = matrix[0].length;
//            if(matrix[i][0] <= target && matrix[i][j-1] >= target)  {
//                int l = 0 , r = j -1;
//                while(l <= r) {
//                    int mid = (l + r) / 2;
//                    if(matrix[i][mid] == target) {
//                         res =true;
//                    } else if (target < matrix[i][mid]) {
//                        r = mid -1;
//                    } else {
//                        l = mid +1;
//                    }
//                }
//
//            } else {
//                continue;
//            }
//        }
//        res = false;


//        IPhoneObservable iphone = new IPhoneObservableImpl();
//
//        NotificationObserver e1 = new EmailNotification("abc@gmail.com", iphone);
//        NotificationObserver e2 = new EmailNotification("xyz@gmail.com", iphone);
//        NotificationObserver sms1 = new SmsNotification(99845687, iphone);
//        NotificationObserver sms2 = new SmsNotification(88757647, iphone);
//
//        iphone.add(e1);
//        iphone.add(e2);
//        iphone.add(sms1);
//        iphone.add(sms2);
//
//        iphone.setIPhoneCount(10);
//
//        iphone.remove(sms2);
//        iphone.setIPhoneCount(0);
//        System.out.println("Second stock");
//        iphone.setIPhoneCount(4);

//        BasePizza pizza = new Mushroom(new ExtraCheese(new NonVegDelight()));
//        System.out.println(pizza.cost());


//
//        ShapeFactory sf = new ShapeFactory();
//        Shape s = sf.getShape("tri",8);
//        s.draw();

//        Game snakeNLadder = new Game();
//        System.out.println("Please enter the number of users : ");
//        Scanner scan = new Scanner(System.in);
//        int users = scan.nextInt();
//        if(users < 2) {
//            System.out.println("The minimum number of users is 2");
//            System.out.println("Go get your friends. Don't play your self :) ");
//            System.exit(0);
//        }
//
//        for(int i =0 ; i < users; i++) {
//            System.out.println("Please enter "+ String.valueOf(i + 1) +" user name : ");
//            String name = scan.next();
//            snakeNLadder.addPlayer(new Player(name));
//        }
//
//        System.out.println("Starting the game in 3.. 2.. 1..");
//        System.out.println("Start");
//        snakeNLadder.initialize();
//
//        snakeNLadder.play();

//        String s = "AABABBA";
//        int l = 0 , r = 0, maxLen = 0, k=1;
//        Map<Character, Integer> map = new HashMap<>();
//        while(r < s.length()) {
//            map.put(s.charAt(r) , map.getOrDefault(s.charAt(r), 0) + 1);
//            if(map.size() > k +1) {
//                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) -1);
//                if(map.get(s.charAt(l)) == 0) {
//                    map.remove(s.charAt(l));
//                }
//                l++;
//            }
//            if(map.size() <= 2) {
//                maxLen = Math.max(maxLen, r-l+1);
//            }
//            r++;
//        }

//        String s  ="geeksforgeeks";
//        String t  ="eksrg";
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for(int i = 0; i< t.length(); i++) {
//            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
//        }
//
//        int l = 0, r = 0, count =0, minLen = Integer.MAX_VALUE, index = -1;
//        while(r < s.length()) {
//            if(map.getOrDefault(s.charAt(r), 0) > 0) count++;
//            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) - 1);
//
//            while(count == t.length()) {
//                if((r - l +1) < minLen) {
//                    minLen = r-l+1;
//                    index = l;
//                }
//                map.put(s.charAt(l), map.get(s.charAt(l)) + 1);
//                if(map.get(s.charAt(l)) > 0) count--;
//                l++;
//
//            }
//            r++;
//        }
//        System.out.println(s.substring(index, index + minLen));


//        String word = "cuaieuouac";
//        Map<Character, Integer> map = new HashMap();
//        int count = 0;
//        int left = 0;
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                map.put(c, i);
//            } else {
//                // Clear the map whenever meet one invalid character
//                map.clear();
//                left = i + 1;
//            }
//            // Valid substring can be formed when all five vowels are found.
//            if (map.size() == 5) {
//                // The begin of the substring could be any index as long as the substring contains all five vowels.
//                // So the first valid index is the latest left that doesn't contain any invalid character
//                // The last valid index is the one we have to keep in order to have all five vowels.
//                int min = Integer.MAX_VALUE;
//                for (int index : map.values()) {
//                    min = Math.min(min, index);
//                }
//                // Add the valid substrings ending with index i
//                count += min - left + 1;
//            }
//        }

//        AllPermutations a = new AllPermutations();
//        a.allPermutation().forEach(i -> System.out.println(i));

//        CombinationSum cs = new CombinationSum();
//        cs.combinationSum(new int[]{2,3,6,7}, 7).forEach(i -> System.out.println(i));
//
//        CombinationSumAlternative csa = new CombinationSumAlternative();
//        csa.combinationSum(new int[]{2,3,6,7}, 7).forEach(i -> System.out.println(i));
//
//        CombinationSumWithOneOp cs2 = new CombinationSumWithOneOp();
//        cs2.combinationSum(new int[]{1,2,1}, 2).forEach(i -> System.out.println(i));
//
//        CombinationSumWithCount cs3 = new CombinationSumWithCount();
//        System.out.println(cs3.combinationSum(new int[]{1,2,1}, 2));

//        PalindromePartitioning pp = new PalindromePartitioning();
//        pp.palindromePartitioning().forEach(i -> System.out.println(i));

        // Recursion -> DSA

        //  Problem 1: Print the name n times;
        Basic b = new Basic();
//        b.printName("roshan", 10);

        // Problem 2: Fibonacci series
//        b.fibonacci(10);
//        System.out.println("Fibonacci of  : " + b.fibonacciRec(9));


        // Problem 2: Factorial of a number
//        System.out.println("Factorial is : " + b.factorial(5));

        // Problem 3: Reverse an array
//        b.fun(0, new int[]{1,2,3,4,5}, 5);

        // Problem 4: Palindrome
//        String s = "madamlkjm";
//        System.out.println(b.palindrome(s, 0, s.length()));


//        AllSubSet all = new AllSubSet();
//        all.allSubset().forEach(i -> System.out.println(i));


//        AllSubSetAlternative a = new AllSubSetAlternative();
//        a.allSubsets().forEach(i -> System.out.println(i));
//        SubsetSum ss = new SubsetSum();
//        ss.subsetSum().forEach(i -> System.out.println(i));

//        Queens q = new Queens();
//        q.solveNQueens(4).forEach(i -> System.out.println(i));

//        RatInMaze r = new RatInMaze();
//        r.findDir();

//        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
//        input[input.length] = new int[]{5, 7};
//        List<int[]> result = new ArrayList<>();
//
//
//        result.add(input[0]);
//        int[] merge = result.get(result.size() - 1);
//
//        for(int[] interval: input) {
//            if(merge[1] >= interval[0]) {
//                merge[1] = interval[1];
//            } else {
//                merge = interval;
//                result.add(merge);
//            }
//        }

//        String filePath = "data.json";
//
//        // Create a list to store ids
//        List<String> idList = new ArrayList<>();
//
//        try {
//            // Read the content of the file into a String
//            FileReader fileReader = new FileReader(new File(filePath));
//            StringBuilder jsonString = new StringBuilder();
//            int ch;
//            while ((ch = fileReader.read()) != -1) {
//                jsonString.append((char) ch);
//            }
//            fileReader.close();
//
//            // Parse the JSON string
//            JSONObject jsonObject = new JSONObject(jsonString.toString());
//            JSONArray results = jsonObject.getJSONArray("results");
//
//            // Loop through the JSON array and extract the "id"
//            for (int i = 0; i < results.length(); i++) {
//                JSONObject result = results.getJSONObject(i);
//                String id = result.getString("id");
//                idList.add(id);
//            }
//
//            // Output the list of ids
//            System.out.println(idList);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        List<String> list = new ArrayList<>(Arrays.asList("a337d566-e685-48a9-a46c-ccc3bb475fb1","4cb7138b-edcf-4361-ae63-fb376eb416fd","32f1debe-858e-4325-b13b-135d380e3c70","cea0020e-7604-4e21-b4ca-1780906824d8","59a77ab1-c340-46fa-a24a-0df85ec71c71","f9c4ae89-0138-4a61-a687-335ce25c7470","f83b29e7-96dd-4fa4-a7c3-cdd358d18f5d","bf9b6cc1-3e86-41fe-b143-566531d32e2e","cdba8ceb-2964-4ec1-9023-f48268885ab9","26fd5752-19ed-42e3-92aa-9f7f76c670b6","a70be8f8-4332-481f-a421-2e7b83813ee4","f9c61439-422a-49dc-9c26-dc035e530dea","746b8846-49d0-4e64-9259-28d658bded43","dc4d425d-5f58-4f41-83e1-29c93ee4ff68","cf07c16c-73e8-4fff-a9d6-ab522752b1ab","b2d45de2-e37d-4bf8-a4bb-0cd93ed94a75","d60c30de-4340-4e71-8fa9-2dc49b9ec56a","877950da-b02b-438a-b008-459a7447af11","4d976cc9-184e-4238-be41-459523840e26","aa78ee20-a16e-4a01-ad69-c9dea8bf78f3","b3f6f68c-b711-4fff-b9b5-a668a088d8be","9f4844e5-b7f1-47d3-8a14-d9a2dff0a113","fbaebce9-6058-4535-bcda-a5f2dfa18e96","f71ae7e6-9cd8-41dd-aea9-d216704ff39a","689109a8-7ea9-4ae1-9329-6b2c49a9d147","c5edbd76-1286-40e9-849b-f84872c6aa48","5b69446f-6c65-4e8b-a018-c39f93f21ff7","e2635f36-6341-4c3f-abec-65aa87bb530a","b751a541-ff02-445f-83bc-d50aab76b840","68580d3d-9d9d-498e-9c10-b18c0267917e","ea8fbeea-f3ff-4c02-b17a-584f86245a8f","32c1d8ab-7d6f-402b-880f-abe34d27fc20","df39e0dd-556c-42eb-ab8d-2e37710fd8a5","85333647-ccb3-40c9-bb71-f5d7257c0601","4f360694-bdc3-4fec-8d1b-ee1a4e19930e","1be46e8e-5a74-4048-beab-11949300105b","eb6c2c89-fbdd-4234-80f1-02b24244e741","6ac72798-db51-413e-b78c-858afb0260c8","bf040ce3-4e69-4d4b-bd52-f9c47dfa55e5","261c04a5-54e0-45a2-894a-10bc461e8463","24d8e114-61b0-4c71-be01-870d38a24b86","f6eb7864-5904-4bc6-a1d4-4d3ace86b9c7","910b254b-2713-4131-98f1-b95eca013c8b","82e0e885-b738-444e-ad92-4187693a7d78","f98fda74-05b6-4eaa-a6e1-4e84d8054e23","c762d6b5-f4da-4b94-88e5-99e8a2868142","596c75a7-ebc9-4b06-83b1-0c8e2e15c363","bffbc92e-d7e0-44d5-93ad-54557265e5e3","b8ee371d-6ec1-4541-808d-059da76724a1","8347db4d-f1ad-453f-9225-9026a189c8ef","28e2208c-10a4-46b0-ab55-38f624be73ea","66399626-b244-495c-9353-5955d07423c9","09628f4c-600a-45be-839f-123f507ed83a","8888196e-0e38-4e2e-929d-d32553615232","62b0b419-7441-4df7-aa03-c2e78acd4b79","7bdd9429-13b1-4faf-a43c-f540ce23c190","740686cb-7312-4ce8-93e3-2cfee309caff","adcc9e7a-7d45-4680-ba23-5f0fba643b94","c6846c92-5ed0-49bf-b1b3-5f77cc7cf59b","ecb7aab0-b465-478e-be20-118ffa915e0f","f3a263fe-332e-4881-a131-db7c34c9e086","eb518e34-f3df-47bf-bf13-01fea6c9a5f8","f9895db5-f3c9-40a1-8955-95e27e9ed8f6","5fe89037-6af7-40da-a4cd-e7855f37dea8","311760e8-86c7-4c60-86ab-503084bdc522","67875d69-3984-44b9-9e25-13d095b08452","7abb5b9a-ea86-4edb-a905-429f9845c1bf","250d179d-13a7-4b05-9517-dee3f86f7eca","02b510a0-6fb6-4278-8b8b-065ffa1d8334","12d30774-b78b-41be-beb7-a4cbd7d49ae0","f4b3369a-a358-484f-be34-df70e5b69f11","2490932b-ea8f-4ec4-ad66-8cd6fdaff3f6","ca1da631-d077-4fdf-9d2c-c8de96b3f842","0a92ad8f-389a-48ad-87c5-8422a705358f","d6019e06-0264-4888-ac23-dbb568e8f2e0","2eef0fe3-7593-41cd-94ec-fe492ddccccf","8dfcc524-d6ff-400d-99ef-63c67596a709","030fa937-7415-41f0-85db-ed315ea2546a","17cf919e-11e7-4133-8de0-4c729af73c24","c98f0a42-d02a-43d7-a591-d08e2f77158d","9df805ec-eb2d-49d8-bdf6-9026ab34ebf6","6f44d419-eb35-4bac-ab8f-7c266a2e2a66","b2204ec4-df1f-4c4c-9fe9-0ed11cdae6db","c91eddc4-2de7-4009-8ab8-88856bc10486","7895417f-b463-407d-9927-d9d57dad4b19","025b0bca-3d61-4315-82ef-87859430b3dc","ed4b288e-6f91-4bf3-bf21-428cd9b59a1f","39dee082-82e0-4f95-ae48-1843d176b30c","0637097b-c7c7-44fa-b181-50c69f2424d0","cb703e52-bf87-4b73-b8a4-e864d3531910","38cbff48-696c-48aa-9dfd-a23db35c8434","72005014-e8ff-48b5-84f7-ab97e3fa41c4","27b6a1f5-58ef-41d6-8327-914f56dd67e1","640ac10b-43c1-4cf9-a688-8b58592b2460","2baa46b8-4354-410b-987b-761de4c00e51","bab1c6d7-1d26-4fca-a906-d6b8d1c99085","e4137f81-6d9f-4520-a9b4-b300fffd58ba","74c01d11-8525-4856-96a6-476d0c530853","b5206ba1-bdac-43a1-b485-1e53b448bdae","433f6a53-ca76-4da1-b0e7-2ed71d758be0","44d0e72d-f4e2-4f04-a06d-47d8dbf35737","7d232111-aa7d-4202-aba7-97fefca731ae","9d79ef2f-d6c5-4816-b004-58f868dbac7a","88de4e46-0795-4512-8d8d-6fcdf0c6b262","ed585ffd-2e3e-4404-8566-55128f444dd3","cecc537b-839f-4670-b155-639bba6c30cc","1e0e5ba7-012c-4890-ad87-d26e54ec507a","ea62b402-d218-4702-9937-03f2db47ea32","71283249-59ad-473a-85f3-c04aaed36c65","9969546f-81e9-4c20-b55a-375b0f468821","1e173b34-9bb3-476b-830f-b6f8672be2f8","3c8b2f69-f4f3-4c04-86e7-c3d8e8db20e8","c09a354b-df8e-47cb-8824-3f345a63905e","0ff74401-f7ee-44a3-9f16-946ff03310ed","e442e576-8373-4877-8ab4-f0bb0be4c9d2","2befe456-22d5-4b6c-b9bc-cf22be70527c","25f0b431-8adb-480a-b141-c4e861b13207","a4d2af2b-049c-4d74-88d3-c6c7dbc7ba3f","2dfd89c0-9878-4d9b-9f34-0ebbca5a866f","22ca3fb9-316e-4165-90f4-b2907845f7e8","04ce4533-9a62-4e2a-8436-dd4c274643c0","852fe43e-71a0-4758-8e64-0cbc74941f38","716f4596-0592-427a-9b82-b7b9d5be72f6","00683292-8158-4292-b40d-86ed6f330fb5","b702edae-b4e9-4f1e-b7bb-38fd951a81bb","b51a6f83-b7af-401a-8cc5-714fff428a28","c4c3d5a3-1989-4791-ae62-4fb582e1dbbd","accbee5d-3871-48d1-984a-bcf6fd2e2658","94118618-bd4a-469e-8fcf-031f05460fdf","ae48590f-eb6a-4915-8ce1-daea51c85fc3","05d669ae-1485-4053-b1c3-1a7b4bdfb7da","58bac0fc-d1f2-4d01-98c8-2ec8822e3e25","6bae918d-4288-4b08-8aa0-31a854a9c060","7067724d-b854-4dc7-b264-73b5598f3807","4f1847ee-1d0f-4b84-9c31-53ff7b399b64","c7e15ae3-0bd9-46bd-9e77-389b778e56d2","24ba4da3-cb6e-463a-b35b-94ba269ea296","514a3a62-4f0f-4ea2-b5ab-c3c1868f340f","fba1eadc-c208-4eca-9f00-4b178ab5104d","29808291-f1f6-4b5f-9b5c-9fba85905077","6966a03a-b4c3-425d-923e-b35b20556bb0","406b5d7b-b604-42b2-878c-45d8a06e1ae9","ca182a6d-f97b-488c-ac71-6c1ad97ad222","70559af0-7b16-49c0-923e-172eb6028db3","09eaba85-439b-463b-83dd-00ad1b967b56","0f2d0b93-bc34-4b14-b2b6-ada5041095c6","9602956f-a24e-4c51-8513-b0eb54c0d6a4","dc0b7542-ccd6-4793-bcf6-79b7b28d8659","75f5c148-4f50-4b2e-b514-fae735a1e568","9ad52bea-fe99-4fba-b1b8-c3b4aece0fe6","897f0fc9-0885-46e5-8b5c-43e2e4833073","5db2dd1a-f087-4053-88f9-2fb928783185","6597dee9-a876-4f10-a4af-e0e8b2491d72","c93d2f50-a77b-4b77-b01b-2454189486a7","e2dd2c05-1c45-4de9-a45b-4f442a2d717f","bd2c4038-3cff-471f-acf6-bca4b8e2b255","fcda3e79-af24-407d-a590-7bdcd153a2f9","0c75e110-464f-41e4-b146-9b55d3da4234","a3c6da7e-e552-42d1-83aa-95e29d9ab457","2967335a-4290-485a-b198-1367296b2c03","fcde8461-41e6-44ff-8424-1bb340922dfd","41eb2831-e87a-4c49-ab9e-74f2910111ca","0809954d-4fa7-4d2a-90ff-14a353302937","2e307f53-661a-4026-9584-97bc29f46131","6cf90fad-a6b8-4c90-a74c-1940ecd9eec8","ea5ce85a-613c-4c48-86e7-d431ccf7ccf1","9e0338da-803c-4364-90d5-852e7338bf38","3b50faeb-43c8-4942-a99f-af31a2244d3c","0749f196-f272-4438-aead-beb6ba4cddf9","bc18d0a5-f1ed-46be-813d-9b48b00daea8","ba2b90a5-b820-40a7-a0a9-21c309a91746","f36e52e0-b2c1-4798-9849-b9023fbdf30d","006a8877-dbcc-4807-a666-34de90e0ea58","df1e593a-55a8-46b9-a608-beecf4655577","005aa0f3-ca9f-4399-b4bf-6ed0a478b2a8","b38eb941-4ae3-43ee-bb39-7ca260b825ab","efb9b3bd-fcf5-4585-b742-43549ba743e7","a21f8c84-0bb3-4e27-bb95-27c03b02c13b","13d04294-5e9e-47f7-981f-6b9540fc6506","e0a2b5e3-1bab-45f4-9c0a-70146eef0d15","3a38ff5e-dc82-491f-90f9-6cfec1242713","b1be88c6-28e1-43bc-a377-db377578de96","c8c8dd51-5d3e-453d-bf81-acb454be144e","281f226f-263a-420b-b863-c3c9db43d753","a346bd94-e535-4716-8120-a3936019627a","c37479fb-3c0a-4487-ac08-356699f297d4","fe615581-6131-4691-a167-dd8a27d74685","30979d36-3edd-4c5b-9032-a68df7e763c3","612f34c6-e0fe-4fef-962f-230df2211cf2","39b3684d-451e-4bea-a8f7-9a549043fc88","7006bcef-09c8-44c1-8947-0a679a932071","8a277146-f8c7-41ec-b393-cba578a37abe","96b4f029-ce6a-4910-a0be-09b37ce697ae","d8189fad-5c7d-4df1-b2a5-86ba122d0970","bc02a38a-d66b-4255-a41a-040503c8a6a5","6d99532d-78e8-4b4f-b4a1-a383ab16c1e1","e93ef9b7-e6b7-48c6-8a54-677125313c80","63a3e937-66a6-4c77-a59e-1d1e241943e7","8770ce86-3227-4803-9ed8-e6bbf90ebf06","ba221734-8680-4f06-ab52-53ae4d4350ec","1fb4604e-bfb4-49da-b184-e94a699dd627","e6043d4b-b536-42b0-9c3b-b99f3b14096b","67601320-14f3-4635-8c68-b6773443d7c1","362b5201-d846-4976-bcbe-e708c8180d69","b66bcea9-1b09-465a-949d-608896ed2f7d","2415ed0c-bcd9-4847-99b6-da09d8a07723","24e7f905-4ba8-41eb-9054-dd051e090ce5","14fe19b8-b1f6-4642-8a75-b011014cc333","ecf7a531-2b5d-4b55-ab04-1fed350a3511","0a948c55-623a-4973-9efa-d2f7d9b398d3","03ef04cf-c754-4618-8721-ea8244754724","10cfca8b-f0ee-4032-ab12-c26732359d1a","7fd9f698-a910-4dac-b2af-7988082f2e28","fbb45cd0-102c-4bfc-a85d-e82b711f1e7c","36caa2ff-4ab3-4a31-8871-5ef22e9b9e79","2d8e8da2-1636-423d-a26b-54a6e27c3846","a4c29737-6d35-49d6-a79e-cbe86a3598fb","fabe54e2-5c8f-46c5-8d10-b26bf24aef98","a77cbda1-be3b-411c-93ff-f912e2e30730","ca9589f8-5c9e-49a5-8f97-3dfa8486c601","4c8a1a60-399d-4a92-913e-3831a97c14d6","1a5c9d04-b0c3-481e-a09f-2e0dddad5d37","b35cffa7-4b0f-48e7-94ec-15d326bff3b4","6bd4f281-2ebe-4908-90f2-c5c95db35e3c","59448a4e-d6d9-46e8-b0ab-36859c549317","fd4db364-4250-42a5-bdb8-5ffeffd9791c","75081f93-f17c-4771-b8a3-cf48c5294658","48744b80-9150-4258-98f9-ab0762b2e9ba","9f876c92-144b-407a-8ad1-2a1fa14819ee","b30a0b86-43f2-4d6c-8302-7ab7875420c9","e3e82e2d-57bc-440d-99a2-2f819ca53363","73016a85-c979-4916-bd09-2c3d5c9db11b","b173332f-5fd0-4d90-94a0-ac77d6dc5580","7e0ee644-7c53-4d10-974b-49f3adbafa4a","4cc2454a-d237-4bfa-a85c-8aae6ae4ef73","2a2f06fa-d673-42e3-9371-3b20467062c2","e297c810-c320-4549-b8e3-36ab96aed479","5f0d12c2-cc86-4347-b89f-c62f2f41ab00","1b8a8ca4-f094-4808-97ae-76c00a2e60bd","61b0f9e0-1fe9-462d-8eb8-ef0634219a45","9f8668ba-f32e-419b-ab25-dcea75e81b06","ed1aefe4-419b-4fda-87a3-9b82e14897e7","9d46e0b5-f15e-406a-a0d9-3f7ab4e3cbf0","474e786d-9281-4d1d-a730-2aa1b06b2202","8ef6f5c2-63e4-4146-81b2-ed46019ae6e1","6e01d687-a337-4294-81dd-7d71ca555c08","1b5f3d6e-079f-402c-a191-a1b458033150","e738c844-076a-4cad-8e45-6a8746f0ffd7","a1c269c9-520f-4da1-a08a-d86855eeaa5d","8f87cafb-3210-44fb-8b69-2c2bfc37bb07","be5d30d5-4c53-4ba0-9be3-fd5d9dc03506","bb01e04e-6482-470e-8686-22b720dbf807","c6d0b9f2-77a7-49c8-a9e5-7776a2eb58ae","505afd43-02f5-4ced-a582-0ab755b8f2c4","9ca1cff7-48e3-43ef-a544-933bdb63592f","4924e335-e51f-4e8a-af29-61d531c7ea9e","d4abda95-e458-4650-adcb-cacc8cd91ff5","1028f115-b159-4571-aa25-df7253835e25","4d262918-b65d-4ea3-8195-5060f057416c","5199c77e-ae34-4ec6-a16d-c8532c74bc46","6e1b85c6-af57-4435-b49a-edf97e9e5a98","7c61e1a8-8d27-41e7-81c3-ffe113412d4b","9042600b-6653-43c9-92ab-8498681cf95f","4e5577c7-0084-4c86-a4bd-ff8e946c03f5","e950e09e-fd72-421f-9fec-6c646e4ba80a","18b2d06e-c6aa-450e-8afd-4bab56ad37ef","ce503110-57e2-493f-b050-548bace426a4","36122122-b159-444f-a74c-3dc81e118d70","5187d153-8f80-485b-baf6-9de47393335a","35623313-915e-4172-9880-ba3ef6c9cd3e","2506ab00-ee87-42e8-bf0a-dbdf69aa3700","df29a2c3-0a55-46cb-a516-2cb9e7b0a24d","bd5e1a4a-1061-43aa-a69f-3676d9ef11e9","f64d9bc5-f70e-443f-9ee1-bc824c0eb035","59756c16-5d1a-4114-9d01-41f3d083744d","9fad8460-0010-4b6f-a6fa-650fcf2d1820","0282743a-dc73-46c2-8aee-26ba5f5a8a8e","e6b7de4c-6cf6-4c9c-96ee-3ccf7b7f835b","707bdcbd-f822-49df-87b1-81a6795ac960","8bb3a5bc-c018-4591-a925-4beab36d1dd9","8a022c0e-3e39-4f09-af48-59be6b61f2c3","e065b12e-c063-4c79-9477-54836c29e89a","46972612-1fb7-4d44-a719-e56e618b7621","c5c6ad95-aaba-4cf9-898a-74aecf394db6","516de981-bcdb-4d71-bdc7-92c58dbb4964","23157873-ee8f-4629-8684-c7e04715cda0","9bdff0ff-0d9d-40fd-a151-565d4f1947ab","ef0d934c-660d-452f-83ed-a8608bdbc2e5","0ac5f776-8628-4ee7-8ebb-6088de665a98","db02381f-296b-4358-9f27-5d9938b2a8ca","60d7a85d-9f74-438e-a208-4535bfadee59","a933cf0c-6d24-4e82-8376-569eb704313e","cbd8330d-1e0a-49e4-a36d-46edd961b634","8717c9f5-0eee-4113-9937-c92c92e5560c","cefd13e6-30c3-4bf4-92ba-74f3f47832d1","862099d1-f1d0-4cab-87d6-9d74776566fb","a48e417c-ea3c-420b-af2b-efad8ac2ad0d","44f05bd8-4644-4ac9-b8df-2c8d26fa7775","6202ff81-a32d-40b6-884a-1eab26a8f06d","4a800d06-0113-45d0-80bc-a495ad0dd27d","52489ee4-d1bd-4aaf-a80d-a52ae86371dd","0e709738-69fb-4e9d-98d2-8173380db221","8befedbf-00b7-4eb0-a70a-20915469a6a8","58e17b3a-1174-4811-84f5-8efe57061fe0","f8fec941-9523-488f-ab25-aca1fcf490f7","e6ac1ae1-1ed2-43da-a4a9-b3b7eb43bd7f","81066121-7c3f-4967-99aa-6dab729d25d8","89ea82fd-8c87-4054-abdb-935c46727df0","7bd640f2-4367-4667-b086-4e9ecfd0a682","94e23bf0-e629-48b9-8f20-6d745a2cabd6","29c7d574-94aa-4c33-b037-ccd636f7f654","e6d403c3-7ac6-407a-bb8c-114e1343ef1e","df86de76-1cf6-4ebd-8a93-7fa5655a87cc","da067292-a65f-4a2e-ac27-1f6ed65ee4c2","7d64eee7-c536-4955-867e-25f854b3fa96","3d486345-18f6-4d22-836c-ff7766ffe6ba","f67b43f9-0a14-46eb-ac09-578f20379fcb","1dd20cc7-bf43-49ca-90ab-a795a7bebd31","f3c1d1a0-99c3-42b6-93d0-0a32615a3b1f","5dc73357-d216-4016-bd24-9940b3283874","be818aee-a18d-4f74-852f-ec16e658164d","41202257-aa22-41e8-be5d-141213948be1","cac3e93d-0e43-465b-ba0b-1368749ca7f5","b2b61858-c959-419a-9c2a-74875b93e163","51cd8f54-c19d-497b-aa06-e98ac1bef483","276afc80-f064-4309-93e1-3ef18d9d78d1","12d6bae2-7c0a-4527-a5ee-3273e174a196","21e73a6b-0fa9-4ffb-917e-f6561b627f09","415d9400-9a4e-4c12-b70b-8f41ebadc9f3","39af9a2a-8b83-4e84-9d48-f9fe41493971","41866379-8f3c-47b5-ade6-2b4ad95178c0","0ad69191-2dfa-4541-8eef-9e0070493eff","df5e74ae-bb84-45ab-96ae-5fd80f7d44de","40e780f6-832c-4b99-8194-da27c88eb105","bbd79d50-263c-48ae-9cd1-c79beaa14c05","9a9e2c21-5d82-4067-b3e1-2ddb8f196fd3","bc36b53e-952c-45ba-aed4-8d8ef1cd6ccd","a8bb29b5-0125-4097-b402-28949d99e908","09e7de84-b6dc-4966-80a1-08c10ba527e0","32144c4b-7e33-4969-917e-bb1d57bb9366","ecfc6f57-dff5-42f9-b3dc-7e9c37245b34","15f8cb39-3739-42c7-a47f-4aaeaadefc23","e789eb77-0bae-4eaa-a696-652154ef17b3","04f429a5-7c96-41a6-b301-fe1d49b391b7","39eb5fe9-2a61-4488-a154-0cb1ed71a8a1","445a12e3-5593-496e-995c-e98c7cff51ef","44766c16-cc37-405f-999b-2d4b631cd4d4","082261c9-f6b5-4f91-9a57-72f290f8e8d4","985922ad-dbc1-4998-bc0d-d2c58eb4090e","9a3ce044-b549-4e8f-83ad-c4041cd0a622","ecdb8821-d7d0-4bee-93fb-288690f4b45b","6f4ccb92-2c64-4953-8963-7a617d743f28","f49faca5-b5dc-459e-a8f8-4d93b2f55dc3","0fcabefd-6d7b-4ab9-9019-134efbb0ff16","f67c67e4-e2a6-4a74-adf0-0107a2ab2f75","5e5159dc-7715-4c2c-ade7-427a1e4d9fb2","96a8f5f9-362b-457e-ad27-965a9533484c","190436a3-1e3c-4800-b066-6ca84df8a18e","e52efeb6-221d-4d9c-9764-8b6ffbfe27af","cd3a179a-a6e6-4909-8dc2-547b9f2f2175","793e7a8e-bbcb-49f3-93dc-d913e8f41a30","583c3629-18cf-49bc-abca-f5e033c1fde1","6b8f745a-46fa-4379-93fd-4f0d7efc4b96","5c077e62-c805-4ed0-bc4b-00dd1fcc39b3","5c8821ac-fe8a-456d-a1c6-18e977e38858","8b01a832-6274-4973-bed1-053d8ad6cdfc","61ebdbd7-668e-41f6-ad23-ccb4df8f614f","1782b83c-2d95-4782-bef2-3832940866ab","9ed70068-fab7-4666-b09d-87a1ad0ab740","8ea6c23d-e245-4ab5-8f49-19b6895e5859","e0f4c9a4-c369-4c89-96a4-700a3652e892","071ce7ef-afe3-4487-9ac1-cf41641b49d7","a3a69785-37ed-4c58-a1ea-8e2ebc9630f6","d25b36b6-0548-4703-8fea-6b8b50d7e5ca","e2e38f20-b626-4003-b8ab-c8f08ab65f40","8ca4f697-050a-4054-9a1a-de4a9721ccfe","83fab64d-4ea4-4ccc-9cc9-9ff6aba99fe8","44830ff4-b698-4f31-bff5-36a9d2274485","a9f23f21-758c-4a18-882f-7184712bc7e1","de701e3d-f956-4b53-af99-5676626e0c55","f1de4f5f-3492-44c3-9f5e-7cc7e815e93e","b75b332c-efa0-48ce-8cf0-527917135b90","363fbb1d-6a41-4a1e-8481-ca206d3f9caa","c891a8f2-f9db-4639-add9-dd4ea8dfa320","c93d89a3-7b7d-4b18-aa8d-3cc40905a1ff","02379dfd-23ee-4a8d-ac08-2e6357940164","20b25e07-6d29-4b44-be78-53050223cd8d","4c44794f-c6e2-4c22-8b3c-83dfbc2cea06","74cab3bf-09dc-4865-a0ee-6a60aa9ce988","cacee336-4e47-45f5-9f94-68e25e8dc092","8d31115d-80f2-4d27-8d09-5a0ddc4b9f8f","a16d0e3e-a071-4a45-8a23-c8d4dadfabab","5d64ae63-4a45-4f75-8f27-3f320328520b","4bd7ff17-1f5c-47aa-9130-fb4925f75d1b","28db97b5-a300-4c18-9bf6-eb332bccc12a","627a7b30-4b50-4310-baa9-e114eeddd173","c4e0a776-bc2c-4ebc-bcad-a6fb34119cc0","58959e18-c8e8-4694-ae69-3f1b56afb23e","aecc1c76-4fc7-4681-90da-32c35cf02d88","1becdd61-d1b7-462a-8d69-08add720ffbc","a0f810bd-b98a-494a-8230-bbae653a25ce","54264d3d-1aae-4115-8cc1-7a58d7afb57f","a283d5d3-090b-4b51-9675-f0e363fc67ce","d4fe3a56-913f-407b-bbae-8b4c7cfc7b56","f730bc70-e8e9-4877-a366-3794884a7bea","3e1ce499-ac83-4ee5-8624-51ac32e62db1","8b3196cd-4cab-487d-af66-3d9f944c0ccd","e51acce5-18e7-43ae-a513-eecc7994a981","adb462aa-391e-45de-8915-374c91621b12","b9f45675-93f4-45e5-ba92-38e072524ce6","508558ee-f424-4f62-a181-5f5ec3dafecb","1aeca857-5cd0-4c9c-a5b4-e3f53c9db8e0","d606e933-e8f3-411f-aba9-bc97e10ad817","b0ea2111-9076-4f98-b331-d91b9d3e3faa","0a3f2244-2ac4-4c73-b5e4-02d0f143c504","f9c82aad-66dc-4020-ac6e-73d042a5c6b3","fbda1018-ebb1-4257-808b-d4fed5ad98cf","d118f3b2-8c13-48f1-a0b2-0d9c1ed161c5","ce58b9b2-d1ee-4ea5-869a-4e8f41820f1f","43461f09-963f-428a-80bd-f599f3693bc5","fd32ac62-9ef4-43e3-af48-2ebbd481b888","d4e0e819-dfd4-48f1-abaf-c0d8e013e8bb","b5765d78-c41b-4f15-8265-c883ab9560bb","882ef791-b7fc-45d8-ab20-197b59be2fb4","a10a2b0f-7480-4a99-9611-c2482f7dc751","3ee92350-3300-4def-be31-f4f3b2a8a432","9cb4fb5a-7a12-46f6-a904-686814449ae3","657bf994-0ab7-4b89-b842-168e2e527c1c","c1d81039-6333-4c33-82a5-2fc545b83441","e19a2dca-9b13-4a99-a683-caeab1c9d9ad","81a27bb7-e476-4c98-a682-26194a0a10b0","da8f9adf-5c47-4f81-aa60-f855891bf0e0","079526a2-0050-4789-8dbf-ec7ae3a762be","2691dba3-1e0d-4d55-9b9b-5a52dc111409","086a9c87-0a6b-40aa-a295-65c0012f9001","feceeec4-be07-4695-b189-5c5ce959a259","27de512e-0440-4674-9948-ccb485ccc47d","7daa3be2-ec5f-4ed8-ae92-478f18086d4a","daa837fd-f2dc-49a6-925d-a3c838c5bb55","701e878a-3127-4038-bd5c-404ed8de9f6b","e798b136-4ee6-4c3e-902b-f48e893e392d","905a7854-897e-49be-b13e-dc3329368b6d","abfd4ef7-d1f1-4730-bca7-d8cd8fd42f48","3835d952-da13-4c6b-ad25-da4700f10d0c","f3de106a-c6fa-4e0b-8fd6-716a3304688c","f352f9bd-47be-42f3-9bf3-668a7375c12a","01771b1b-9c56-4826-82e0-5452e27ddd20","dd81e8e1-0b2b-4400-a25e-408b2f2526e6","db9af2aa-1951-455c-90a6-3a80d18a340d","2326327b-33ad-443a-aeff-f0a302c00f84","fe7ae03f-1cc0-4bd7-9071-06e5485c9250","a8cae5f9-77a4-412c-ad6c-508a1517ed3a","f0dba6a2-bc85-426c-9b11-e53ac52d6261","19a61199-e801-4a6f-bbf4-23665f06d1e6","1857001d-79fc-4bf4-b0ad-9e614c676feb","25d874df-7fe5-4b50-99c2-587323ae8c03","e79e8dd7-2c4e-450c-b053-1c31eccc5680","6266c58e-ef05-44c3-8d77-f49e959542cd","7f978dbe-8499-46bd-bfb5-fef11a6f0f05","0b7e1400-a25c-45fe-88b4-674d22d18269","f46c8099-2c4c-4974-ac2e-333bf99ea1de","60187c5b-173a-49fd-894d-844d1f0b8970","cc365468-38ee-4e3c-a068-04767e267b3a","ec51f24c-6355-422c-a9f9-cd16c461d7ff","8128e959-0bf7-4d4e-bf27-22f9e0056802","0ace48e8-0e7a-455c-ab1f-0dcae3a1a3a6","3fe0246e-6e14-44a3-a1fc-1cfdac938a3a","755f268a-9efe-457a-8c1e-aaaf9589bba3","d54e7124-ad97-4d64-a9b4-522e7e103f28","1153f528-e54e-46a9-b513-5b82c825f6b8","dab97f2a-70e3-41e2-95a8-30a3bece0f90","1060b692-71d9-45ca-be98-00768a775212","caac3e85-3be4-4f47-a6a5-51d058a4ff2b","0a41ab4d-87f4-42fe-8c36-241a9e310a9a","6b05b0d6-91ab-4f14-8a29-23ddba9af6aa","c2d55d4a-b3e3-4552-8208-e29e47bc35f4","08ad480f-2585-4be7-8361-ce2cdbe40a6e","127bf32b-9a59-40ed-8e5d-ae7203f446fc","611ff98b-810d-4ff6-b98f-b845c813823f","3fd62505-0237-49b1-8748-45069190ffaf","5205ca56-c61a-4052-851f-e73beb199102","210078fa-5b74-4288-b485-cfa57304d22e","a9bda7d5-4f50-46c5-bf3f-15a4990fd16c","b3f3d7a5-ca03-493f-b866-083dcf53557f","4fcabcbf-3e4b-4d81-9327-cdd59b48320e","275d4ede-95b8-4a31-8a77-c99dee38c86b","bf901791-3522-4dd6-aeb6-d9655bafad18","0057a5b5-98fd-44be-9549-e87de4f32c9d","05dc89e1-23c0-4bf9-9a00-67cdd34ec2fa","2a99fa55-96c2-40f2-80ec-4acadda3e86d","bf51cfff-62d0-40c5-833d-74ae092fe3fe","b9b70854-ef9a-4df5-b109-c6dbe025c085","5a317515-3039-4f64-a091-a0766e44fe18","96fa4ff8-f3c0-4f5f-9551-9de0ad9d04d0","a91e5bcc-6f59-4168-be77-79607d3ba064","1223f99d-3421-4454-a935-e719991ab081","026c89fa-a795-4573-a819-83d887bfb0ba","8a0e3260-797c-4e9a-83c2-131aca17124b","6f3a4cdf-96f9-4a4d-b0c1-abd6773e54cf","2cfbe845-f5e8-40c9-afcf-075c2909d04b","fb2d4315-18a9-4847-b18f-7329566ff9f0","cd863c2c-606e-4976-8889-1a69e11459b4","f6da5f4c-9a32-49aa-8ac7-5686d3846482","a273dc59-ac6b-4b3f-a548-1e238bf5dc92","6bb501bc-4229-4fa1-836d-80a8378d9c49","2d6ab2d8-66a9-437c-b0a0-d766aca87eb2","d4286e73-d30e-488d-94f3-d22db50ef0e0","d26540d9-b532-48b6-99e2-6f7fc90340fb","0996df6c-6e7f-47f0-857b-21000f35a817","c6c23a81-c8c6-44ed-9905-91af750f4d32","57e2d9c4-338a-4538-928f-7c6e5fbe96f1","051f08a6-35da-4b1d-81a3-8001e6a69ec7","e680d028-ee45-483a-8d1c-1f876bdf52b0","dfa48003-012a-4ed4-a239-b8977fc4f53c","263b9283-fe45-482f-82e3-d2834a3fe309","411176dc-f37d-45ff-b90a-3df69d14cc9f","a7aca61e-b95e-40f6-807b-b4e2d84d929f","81413ad3-d1b1-405a-868f-fec441efdd1c","f5df2546-9ea8-4621-a709-e6cd184f65cb","9810b3c2-73a7-45a6-9717-b44cb221d285","17d7663c-d117-48d1-ae09-95029238f447","4d63ef2b-b083-4986-8f6c-c8a998285912","9240f4bc-6867-4847-86f0-fd9ea04eb73f","fdc62823-b5d2-41df-a722-17cafd417122","f9bc26df-1542-4acd-8fc5-82047554ea2a","07efdec6-7891-44fa-af95-94de0614908d","33c97506-f055-4e75-b6be-c5a5a13b3702","5a3594b7-2d58-48cb-95a5-3b590e5cd7bc","e6f55512-cbe9-4322-afac-fa6d4b826e8c","93a56aea-15c5-4228-beec-d645e29e90cd","812d3a0f-ab58-4515-b477-fa1303a13ae1","7170f9f7-f663-44d3-9e24-bccf16ac6b5f","c064a39c-8d78-4577-9349-2bb83a61d653","1f59bed4-66dc-4d7d-8da0-04f2690005ea","cf485a1c-d9f4-4f69-a6f5-c43acc3537e9","9a23cd53-4d8e-4638-a437-5052a3d513e5","8dfee91a-ac11-409e-bc89-be13ae6a1ec3","58146080-ec19-489a-9a51-9a0dbf8ca77c","3f009349-955f-44a4-8f2b-62b5a4833177","6c08e29a-dcbf-4603-834b-6f8fdaf1183a","1d4e79a4-346e-4701-a607-8b36335b1f4d","1cf0037c-834d-49c6-858a-682da520399c","1f24a75e-f20a-4e96-a120-2bf0b480eea6","c3552c59-247a-4fbb-8616-56e7d9e81f1d","19a29bcc-459d-4f51-8ffa-458b3626641a","bb7f9d72-21bd-4312-90b8-5e8eae76721e","d60671dc-0313-4664-a918-2c5eabbaaf6a","ffd6871b-1656-442b-831f-105919dad02d","8a367a2c-b6c7-46db-bc2d-a797f2cd14d1","f334a495-d0e2-47a3-b293-79a8b27eb8d8","689298f7-62c7-40b9-9e48-a1e7f90cb1b9","2ef19743-296f-4daa-a234-07dac2f32551","f7469103-46cc-4404-b8fe-751c8d442ffb","89c7e4a0-9b64-4162-abe3-ca475af1b5ec","b10d3b43-74f7-4dcd-8beb-9ddc96a69518","a6278fe3-4a63-4da6-91e2-fbeb1c3ac227","fab807c3-329a-4805-a42c-b95c7e07abe4","6ffb32b8-2d39-4f0c-b4ff-eac6072229c5","9d90040c-d389-4566-b1c3-4da4d630b7ba","bf8e9293-b709-45e0-9771-18005e1403b6","5d2c7fc1-5863-4d7f-82ea-da44c873d8f6","ab85dbab-49fb-4bf5-b800-ec2b0881a8bf","0f4eb3f0-b59b-4efc-bede-2135b9323ddc","220485bc-daa6-4463-b8b2-6f71a26c021e","5f212d4f-28a3-4010-801f-7d9a1652f3e5","75437d08-ad47-4013-8a9f-3a5c48c34161","2f598b53-e6af-459a-be96-0b80340f91c6","777a5ba1-b128-4a76-9f8f-ea2edcd4614e","68ed64b4-dfdd-4afd-a2e0-ce1669528378","d80b48a2-50c1-4910-b2c2-da67887bf1ac","7c324a8e-e16d-4799-8f10-0e8627b8ffa9","f3cb23ca-300d-40c6-a2ad-d9739f95f1ec"));
        System.out.println(list.size());

    }

}

