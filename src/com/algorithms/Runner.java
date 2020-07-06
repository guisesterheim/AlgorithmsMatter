package com.algorithms;

import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {
        Runner runner = new Runner();

        try{
            /*
            runner.runMatrixRotation();

            runner.runLongestPalindrome();

            runner.runRotateArray();

            runner.runBinarySearch();

            runner.runCountCharacters();

            runner.runFibonacci();

            runner.runFindLongestStringInOrderWithKWords();

            runner.runFindTheMiddleCharacter();

            runner.runToggleHousesActiveInactive();

            runner.runFindGCD();

            runner.runConvertDate();

            runner.runDubstep();

            runner.runEqualSidesOfAnArray();

            runner.runHighestScoringWord();

            runner.runCamelCasePrinter();

            runner.runWordMexicanator();

            runner.runPrimeNumberTest();

            runner.runTurtleRace();

            runner.runSupermarketQueue();

            runner.runFindMissingLetter();

            runner.runSudokuValidator();

            runner.runSquaresIntoSquares();

            runner.runReversingAProcess();

            runner.runAbbreviateTwoNames();

            runner.runRankWords();

            runner.runFlattenAndSort();

            runner.runSortLogs();

            runner.runCountCompetitors();

            runner.runDirectionsReduction();

            runner.runMultiplesOf3Or5();

            runner.runContainsPermutation();

            runner.runFindAnagrams();

            runner.runSortCharactersByFrequency();

            runner.runIntervalListIntersections();

            runner.runInvertBinaryTree();

            runner.runCalculateCostCityScheduling();

            runner.runFindCheapestFlight();
             */

            runner.runSearchInABinarySearchTree();

            runner.runFindUniquePathsCount();

            runner.runCoinStairs();

            //runner.runBinaryTreeLevelOrderTraversal();

            runner.runPrisonCellsToggling();

            runner.runFindUglyNumberII();

            runner.runPlusOne();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void runPlusOne(){
        // Leetcode challenge available here: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3382/

        int[] numbers = {4,3,2,1};
        PlusOne plusOne = new PlusOne();
        plusOne.addAndPrint(numbers);
    }

    private void runFindUglyNumberII(){
        // Leetcode challenge available here: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3380/

        int n = 11;
        UglyNumbers uglyNumbers = new UglyNumbers();
        uglyNumbers.findAndPrint(n);
    }

    private void runPrisonCellsToggling(){
        // Leetcode challenge available here: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3379/

        //int[] states = {0,1,0,1,1,0,0,1};
        //int N = 7;
        int[] states = {1,0,0,1,0,0,1,0};
        int N = 1000000000;

        PrisonCellsToggling prisonCellsToggling = new PrisonCellsToggling();
        prisonCellsToggling.runAndPrint(states, N);
    }

    private void runBinaryTreeLevelOrderTraversal(){
        // Leetcode challenge available here: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3378/
        BinaryTreeOrderTraversal binaryTreeOrderTraversal = new BinaryTreeOrderTraversal();
        binaryTreeOrderTraversal.invertAndPrint();
    }

    private void runCoinStairs(){
        // Leetcode challenge available here: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3377/

        int n = Integer.MAX_VALUE;

        CoinStairs coinStairs = new CoinStairs();
        coinStairs.findAndPrint(n);
    }

    private void runFindUniquePathsCount(){
        // Leetcode challenge available here: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/543/week-5-june-29th-june-30th/3375/

        int m = 3;
        int n = 2;

        UniquePaths uniquePaths = new UniquePaths();
        uniquePaths.findAndPrint(m, n);
    }

    private void runSearchInABinarySearchTree(){
        SearchInABinarySearchTree searchInABinarySearchTree = new SearchInABinarySearchTree();
        searchInABinarySearchTree.findAndPrint();
    }

    private void runFindCheapestFlight(){
        int n = 17;
        //int[][] flights = {{1,2,10},{2,0,7},{1,3,8},{4,0,10},{3,4,2},{4,2,10},{0,3,3},{3,1,6},{2,4,5}};
        //int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
        //int[][] flights = {{4,1,1},{1,2,3},{0,3,2},{0,4,10},{3,1,1},{1,4,3}};
        int[][] flights = {{0,12,28},{5,6,39},{8,6,59},{13,15,7},{13,12,38},{10,12,35},{15,3,23},{7,11,26},{9,4,65},{10,2,38},{4,7,7},{14,15,31},{2,12,44},{8,10,34},{13,6,29},{5,14,89},{11,16,13},{7,3,46},{10,15,19},{12,4,58},{13,16,11},{16,4,76},{2,0,12},{15,0,22},{16,12,13},{7,1,29},{7,14,100},{16,1,14},{9,6,74},{11,1,73},{2,11,60},{10,11,85},{2,5,49},{3,4,17},{4,9,77},{16,3,47},{15,6,78},{14,1,90},{10,5,95},{1,11,30},{11,0,37},{10,4,86},{0,8,57},{6,14,68},{16,8,3},{13,0,65},{2,13,6},{5,13,5},{8,11,31},{6,10,20},{6,2,33},{9,1,3},{14,9,58},{12,3,19},{11,2,74},{12,14,48},{16,11,100},{3,12,38},{12,13,77},{10,9,99},{15,13,98},{15,12,71},{1,4,28},{7,0,83},{3,5,100},{8,9,14},{15,11,57},{3,6,65},{1,3,45},{14,7,74},{2,10,39},{4,8,73},{13,5,77},{10,0,43},{12,9,92},{8,2,26},{1,7,7},{9,12,10},{13,11,64},{8,13,80},{6,12,74},{9,7,35},{0,15,48},{3,7,87},{16,9,42},{5,16,64},{4,5,65},{15,14,70},{12,0,13},{16,14,52},{3,10,80},{14,11,85},{15,2,77},{4,11,19},{2,7,49},{10,7,78},{14,6,84},{13,7,50},{11,6,75},{5,10,46},{13,8,43},{9,10,49},{7,12,64},{0,10,76},{5,9,77},{8,3,28},{11,9,28},{12,16,87},{12,6,24},{9,15,94},{5,7,77},{4,10,18},{7,2,11},{9,5,41}};
        int src = 13;
        int dst = 4;
        int K = 13;

        FindCheapestFlightPrice findCheapestFlightPrice = new FindCheapestFlightPrice();
        findCheapestFlightPrice.findAndPrint(n, flights, src, dst, K);
    }

    private void runCalculateCostCityScheduling(){
        // Leet code challenge: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3349/

        //int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};

        CostOfTravel costOfTravel = new CostOfTravel();
        costOfTravel.calcAndPrint(costs);
    }

    private void runInvertBinaryTree(){
        // Leet code challenge: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3347/

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        invertBinaryTree.invertAndPrint();
    }

    private void runIntervalListIntersections(){
        // Leet code challenge: https://leetcode.com/explore/featured/card/may-leetcoding-challenge/537/week-4-may-22nd-may-28th/3338/

        int[][] listA = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] listB = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};

        IntervalListIntersections intervalListIntersections = new IntervalListIntersections();
        intervalListIntersections.findAndPrint(listA, listB);
    }

    private void runSortCharactersByFrequency(){
        // Leet code challenge: https://leetcode.com/explore/featured/card/may-leetcoding-challenge/537/week-4-may-22nd-may-28th/3337/

        String input = "Aabb";

        SortCharacterByFrequency sortCharacterByFrequency = new SortCharacterByFrequency();
        sortCharacterByFrequency.sortAndPrint(input);
    }

    private void runFindAnagrams(){
        // Leet code challenge: https://leetcode.com/explore/featured/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3332/

        String s = "abab";
        String p = "ab";

        FindAnagrams findAnagrams = new FindAnagrams();
        findAnagrams.findAndPrint(s, p);
    }

    private void runContainsPermutation(){
        String s1 = "xuumbjffxuzovdwrnolopeingppzgorotzdqfprokkmucxwsub";
        String s2 = "jpdojwinknmyeorfdhpsysyealozhgbapagzjsivbxmcyijlbdafupblrawguoazuzcqupobxayrkpqxawytdsdznljnxulaugewrbjmkslsrllixpkuvorhnnhkzikovsajrbhjdybocvjloqiikidsnwcubhliajwwqkpqaugidhfxqfxrkluvadcdmekdhckszpojvwpiquazmaecaxxwsnswzxbctqeqhjsrgnjsjmaqbexexuwgfglixsthifevokdgexxkdmzaxrcilmthzemuomexwzipzivdyxqnvgzpjavonrkobmgkormdmfiwwalgdzwlngkrjmdwkknajqatghoddybqfkorhpmrkfcfwsaproaenfedvfendprnlpmuqklsqrsjuejyxulfuhdsyolthhhfhmxorojnjsvqyworupkdzhyqkzikvhltfsrhrecmyyddtinphjsmmbdtrouyifvsvvlamwhkffrrywdiawpvxwcwfkcunbjaelbcmdwczikkfelahowtbwqbdcjggnmknfhjdtusfjotsbjgtlnuonlxjlcwyqiffktonvtrkcogosfbcvcosktnvbeitxuqpexxejnklndzbtzlzeebwufoiwqqcoemnshcpovntjgidophekyntcsrwzvovwmostqudxgeaowehcmqmdrllovmmbgqhaxrqluizhhhslystwkhckjtosnomfvyibkasycxnnmvkbwkbhzeayezughsmqovogrnihjgetsdvhymjmnijzwvpasurcaybmyzfbqepjsdqwmkmomzkociaqtnkwiguylhwxrfamyxjvfxwonwblidvcsenvwigjjqdsnnydlgdhlsdtonvuapzaozkdtyiartimmpwgotnwpiwimbdunqfickerusbvrqwazvnwgdczvnqtigjmkjgsridfulxjekazzqkdynyuutyoffhntfbcruhrmnhhjyyzfszbaqykgnroepiovqqlhdtkizvpivukdutitwzhapvcyfghqvtjyyrdbctvdccoxjtsovdosbyqaiffumnrfokrbgvedxbcytvbcaeoviutdmxwfhxgchnusazcztitxgyjrkjdmajbndlemsnpjwzgvpitrfrjoxivhisgkzncmkewphusvaycteennpltuevohegzvafwxuebmovgkpwlgyoutsbbgxoxdzyisersgaqcnnjnjtjwufqscjzccudbkdcnmorpmraqapvirijlpretmezlrbdvnfixvmalzmgrhwpkhisaztpsgvlooqxezzscjrtnmmctoyinjermwrrmjlfbizryripnarkvnabdizzereczdnbkojpfmxhlfvlztmzpskwttzyusxaudprxpbpihorlipzpdiucpvrqlscmoipvdzsrowjrwmxzomtcxxehrmcaxmtifcvftywjkzgdsohvomcthhylzpijujfyysbientozyirurugevubxpdpbihrudvgdmhwyxuhyorvufffqzifwzszmfswhkesywfyozffzarrklnxppymoaslqctlfbtrykccmgmhrdacuelfrbflsjxhdagaevscxerljtxnwodtfioyxjoaxyhzjmttvflfhqvvcbwvmnulcsubtwngjvomqkqrjtntkzuclolcjmiypjilgvezphjqrjetqnaccrjmxydmmkbmuyxwotfynptdotuaxpxzgjulwgwfbprzolxablskvidnmnzcofemsodetsiubqrvtbkshuokkuomjezwbmtcjvapnlsmutehyfxaqjqlibfzitcfhuivmmclulnrwyknbymyfcwbgyxtavcaebvfwlkikylkrpcfappcamnjenpggoxcrpxdbqjqzrdvnfzxuxuaixbpiqmitzhefcgyhzayemxgrtdoiryqguiexsrysetobkqnfphdechsgoqvmdhurzhvflsbxsdjemmvlzpthrjizfcayxemztvszhhpfvvjgoejrjnmyvxstpejfmiukuocmrgvinqifpdcqvwfddoiyopbzverxwcqdyoqzeqcjcwmojbhcnrksebanfpdhhpiaguxracnxzttbjgruczuhwwjbmznzgdijyemrwcawodqftjtlyozqwwchxtlvlnjqwklmbzirfhaquiltdijijeglroopaagmyrkhqbnkhbxvguodmmszfoomhfvwjsnrmmzjuyxhotehlezyyiptzububvazwzziskqagtpthflchvvanpugjpeoipecmvgkocylsqduwbreeifhjdomajmnbwrmxuhvvjnfblyvtveqalkqlbxkxvmxfefvijptnpvhmgmotrvsxmarhkspdlybniuoxycahgisvnrlrukendhsxvvcqzinnbkryzwbnktsgfwxjklrcgvtrzvkqfbhctljoijsvxbnwiunrasctvuetwvzdulmlnxeivsvujihlmjroxntmgkecjkimcsvfesfeursbuchaexgpyqakllumehlfdkuzbnulwfdacxjalozmrneqtjvdpgkcwnrkuhhqbnpedmysjqcrdqaawiwcucuzlbkwozlgrgcroyebklrwzkqicuqezkswayknmcytcsrtkxkfwxmimpolrqzjwfdzmlkpinifykobpvqlzqrcliorfqygytfgpdociwflhwpuuumrwnhrkpnteqacxejyulkccgxtnsfhuuahifvsshkwrkhptqvcmylyvvykwjhgknmsuolomginxdfwvqpfwlpwvommjjymsunxmbjxlcznmefzvuckeqfpighnxzxdpdlcifxbzldjctrswxmrxcjbbtivfnwqelhkmbunsroodysywhjsysajsrngtsvimguuwaicmuqzmafocvdzudgkmmvhydmafxqrrpkvvnnjyzohjwtjgqbrptggknxpuatfycatgimywhbafhjazjklgzxaiecmqbqgwgdepfspuxakrowawfolujdcyqsmakrkiqiduitooygdduztcquxqyraxhwjkvybbyiksqyqxqfmyzjyxxrxktmfklcjsjeijjflvtjayqlfuqtacxrfbrsdqtuwmflpdtxtjezsgeoeeyhcpncbknslbexvicfxslnqbelcfjonoakbitkizdlmusmydyajmiiouvqhhpmjspwoprvajocrloqydqbrgzxqafbfonuvecxjcrpoiorfqxofionzmomccxkhjqzkvpdevkwpsikonjxfthvtorexdyntvhttbtygzmtrrzprsgqnvbzhxuiruhugtaogfrjqdxnilxatjyltpbchjlkajaxefdjjwhqzjeejznbjkhdjqoltccfgosuuxodgyhvufwdrdxtpuvxlthxibekzkdoufkbstuxhwukrfaqsbratipaaxjawndpognykgltxofqbypomdpdsgncggpoddzbobloikifupdfgytydhxoxtcyerqpgezsddndikvcwufcefpdkdgvrlmvoiadawofsuyezliebpixyqboteavtvqeojxmemrdbptsxdckszxjgveaqngboxfdxqdgddczdzpyhlztthvbzgutaioqswwpzupddayzktwvqyvxcflmolxyewseqrrvpovpeftwgiywoyflwejpffxpubejlwmazjzfcldadgnkkjtmxktuzlocvqhjajqrfrfaloychnmokakwsfkrtacwjgsieptnujtgbbwzllvkpeuewegmkchhaaaptmbmoybtdotctkfyumafregkthibmufiudjrcohdhuhlpjeishhekicdfiiostjmofwhreoegrnbqgkhmiezgtasdaqdcixsrdfdsfcrgjaryeqtkussultserwmyealuvxckhcgojsxzsfxmrtcfhqpowalbbzvpcltiwdhexbvcjojdptxeplgestsnpmpibymzaolqaybmeezyagvvftcuqgqrpjauxjnmudeasbpeormqofrbmmgorysyztkbloyfjikxdrytsdfdrjagghbbjqkujemzvvtioluzitrmaxjphducstlearfirqknijfdurdztizvwoeqzamxkbbvmnbxomhsxfmwdhocdyabcygzojqebxferyieqfislcpwiaadbarnsgnuvhkaidexxcgxhmvsiwqhoxkjwvycbyaqiddlrgsvqvzkvqzeewbxnfqlhavmqyucnnlskzyhwlnpglakbstcsnmsipeekjbwvokjjasfcruinzkcmjtkuztnglqakavnjmvccjgquzfftcqzwnrvywoqxhzbkbjufjuyqqqtaoakzbykeraqalcqzuhjndgusnvdanqrwemqsmcwxelogrfxxsdyzlbfuvopxsyzuizshrtauculajiapoentvnkxpvyfxfecjolvlezsmfmibhptmgdkiucnsralqhtutgvnpzicjwcgrtcgyueuqsxnyspxmnzhupjwalphkutczrptfxsvgeikwqqhesezmkoliizhceciotrcrjhunyfnpeyrnmucyhkozbipsmuqfgujshzhzuxextaapmrbhvexaqyifwrodhftkwbpyndylvfukebddabmjperimjtzeeqwmjzjxjrqglwcsuxinztzxpzfdlirmyroecjkimmgnybedfhssjfzzdnqlzihfgobikowitiqdyzlhxbxifamfkeienxqvcmvhzixicqlylurlfnzbrfoztfjxswwlxkvrhueccohddaazuluirluhzliuqeqiajvmvtbpibfhiulyagqfowibqjkjewqminwsuupmxnijyrbiodfknndgpfiannwlkillxmirfqmmoktexmoqxqujogmxjmkenfphffmdfablsaqxufjwvmufogrzjarlopjhidbfbhoivkknzgqresjprfknjetohwtqurxyngxilywmbgpsctswswwkasyisochqeslbiunnbgxsgzwkopnhgdjyuherwtrkypbjrdesztgkxzueqrhhicwndmidmqahdwcycqpgtuildbowqhjaqnmblbnvvsxahycecvfnbvqzcjburykyjkgazgauobvieoerphnehdjxfianvcaasrctenrcwcgzcqbzufwsqllzbxnjzktgermrodlzuvkdblqcwbfjevjkygbgoalqyibexruhsxsowmchcogiffedbuddithpwocmovwbpvxzhwmyzpuwdhrorlqxxtqtwswmdcszbxwyirhpwjjulqoovmgqydxctjrnncsfevitouvdvsgdftpyjztxrxhuggdtyfandnuvufixthdxidrlzzkssngvrmtkwzifwjoqyawcohqxrucjixdcrhgybujxpbjfwxunbbotjlijfagrdsbeemkvgaebuagweegcgpoleicaakefhgvgjislsamatuqmmjisifffwmigqwxaywwmoyzarwtpiimekzofbycyoqznbnqwnncmzoiwpjgpymvynrgasxpekunmzksdrfxlyxewqmfoeufccrwevhhxxjqzkptkctaqerwotatqgkbnjqbpfyglucttnmxpxrrjhglbmzzjtyupaexfismwrvfgtunlriabhhyklpmevgmltnkdttjmemegytzzikcykidlasvugyzfaozknksednbsdcfnfwtozioavvipvsrkztslcxqgrccocxtwnxobbhidcublbnpwhohqjcxwfftmptlwtpjugbchgxahplumbjqjfvljhqzmbdsdeemxevugsthrveucyqxdktkdymznwdvkuoytvfrrfzrmlnedhckhngadcpugwzfupcudmukkpzrtdqvpcpzspuhdfoeojybisjmcjmcyhiiqjnfkcpepbflwfwmorpgwumlzynzpbbvvrgtxpsgzdelmlohavhyqhrfztmncnllnfdgdotoiojwtwilwwdszhcqbkdwtyrurxkzgcwrcvqlhynujihfdbwnnhkwdmfwciurvrqkmyghvhftbfhjogfrrslmuzussufwkkiewfevkvgalhyutnfxzgxbifjhbqolbsanvwkhyfxywfbvxvoiwcqhvdypwpgquutrugldizlvqaeeboriznjxovvmbwqyrxmxqilplplszubphmeszzrfjoliuskludoukazpiezpzucrsiiiichlxthowlcbmmfnyjyylgrcseraqtwodnxvugpysbosancqgzmxinonoeqmvyumsdwjncgztbepamqupqvxzudrniawehxilhybtdsupswxzjfhhchdeqoidvigjhkonfrdskxvoskgezzhhcpcfodahrlnkoldcdomllfcywrtqofedeychinhsvcssmgbadabdgyvmscucbckahgjawopdwlixbkmlxcpxtaqoempcldkefcerzeiowhgyhreveztowuigsgwcvdjahrfvrvvubliwretdwqslwgusqoqcczbzdalaocaarmtqhgjtzjjwnntuezwioelmwxnvnfeeggjljuybgshzeqsongxutyjovbklauknymkkkmnnwqxixaiwaxfbysglyvazrrcqcbgepgegwlmtycljiaqivlscezkquxkgzubqnbdsfxditryyagiihyoqdhtudnfmkwaohttygtwesumjjivazppjzkbdywdfudbjkubytrfasxkxqmdgnirqronvypulppeaqbjimtvffglxvihsvesvhbagtuikytbocsjnxfoxmtwpfwcdadliexyisjopbkqbjhlflqyxnjdkqndjpbdehwfsljapruwbslzchkyvsmcvocictzqxcktfmoathqnxmlqirfjezhqbboupnzlyqmiqiqkkbhwhpcyibipmizzxhlbjffxdzigymhjgyowmrjouvfjwgyzdovyslmfbplvjnqvfdbfeqvugoqdzvtggrpueutlljsfgudmgrzjqiaghatyzwjbkxxadrwjohhqmnwrswodapavdwyvwicbignxagbqodjeihgvwbdlexjcrltkidjdzjjteihgwedogtxafmajjgfgprbtbktqvirgxvvakqhbvgizxdgmabszclfbkrchaubgcobhpqrtfjbjzhpllxyvuqinnnkzdwqxzjjbniytymygnjzmklhpvazfqcdhafvoxlkxnvsmzfhjcqwdzqmlblhduduwbpbwonfmfwwbvhbgoyhwlmlxfnhlfpzwiybgeqghufeqilmdxzcdwrdwiculhnhzxybxvkwpjbwyprvtphhhqsnukanpnzoxtumxwlgostwbgqmtvdzsecquyrircmlckkzviczrvtkzyazlihddrlohyrovhprvcsmjrbxjaivvgolidxbyvxgkflallznsylhuzrkhrvfakpbhwhrgtwnlczewkyxhcturbfbfvlwvhaykumdftqbkmdxutbnphdsgplxxsdkcfouaprhecugnzdsjdyjkkuvtjtberlrwxhddmshcoyzlrgwugpnozubiglbcjwxjnvnmnbdtvlfbqqijwmdkrzslhsvnxnrsdbkbyxfkluvtofyesakxclxvodsuxwlyqkoyhynxfmpvmecqxxasvmsdrandljnyeepxaiwdvmmrzxstnzzfkxjsflkkrabqkicjutpyrbaewqzwfwdhzjqibmqhhzbnoaucsbpjtvvumkpaehnxxsjgkfpbfannzznhylowtsnilprqrbohrmcucboxzqwnbkbkgldydkqqqgjbtxavejjlxfqweybeaczszapiqiqoqwzhrvnjlmjmdmyyziqcusbpyxqwetclyrhfjrgzxbydajuqnbxhmjgenskqjikmgqlpbmsvuuxehfbydyqvgdfnkdqhlptgaollttiduybwqgaaatmcvdhagbusjrjigyhcphyhowixnezvioigsjdosikthzijrdvsfabprlcmjtjekculxcoyvypsozolqezlgunkhsftyjrffpfkuxbuoolragvarmtjozwqfiqdlaldxdauwzdrlhxlghtovdwesahmzklfoywukjufdiyiepnyjqzqbvomvefaahlnbgjhvumffksfvomrbnfstssvdgpubtmglxicclsijqumvibauoaxvgteljaajfcrqadkxbqrgbwaihxdsaisopmmwbzddapbczwnfnxspgtajjswcubnspwxglemattdgijkavsoanafyrkczcvmxzciuvtiwnraibtfrdqcntksioxjlzstxivizavgurmvwphdfxcvwqicctqicommgehtlunpbknkkklbzcjrxcxjchbszlqhtcdkzbdktkffbbwufcvscjsaraktaatyexzjxvxvoyyzivxpmwuxxkjdkrrmfegzkevmaeotwvpcrjtbfsblfdebacvomgtudrlcrjktvwdaerlafaqfcopbqxujngvxmjelcuesauyxuazrhiztlapgvsdenyqpafckjzohjjbdosjyvombptrppmanummqvahchtqkjdppwwskbygzaqpjlxkiposgfwltwlkvowynkcytprknckyppzvjjqaqibhakstpgkpbhviuqdrnsazdfptdmheqeusmkskdldaqnxthokukmhcpssjrtjnemyvlsaeryoeiclipnrjmbiyzpzfprjeyhphuqtdgqsgmicalezpyoakygeorrhzuyzhqqddhrygeybtoanobkvbfgpchrbtqbampimgefkyrkdfqgwyulvqbzljzbrisjugfjpruwilxneypgflzfldsbkpymcmxfpedmwogtxqrifposbwmohakknpkdbdycsgetahejtlqjaoumqyjbxywbmpbtcgquedhtfbbptomabbnahguvzsayqgvqxolvuflfjfhvmilqdzwqusvlcgemlaouwlgluuqtrqlhwooretsjjtnpnvrpnicakqcfuxotzmvqhsvoptvqiletevbhfbrolhijwidauovqlnqwmwvfoxljrbjtbwuazkhpnxntigrbdlhwbtwtzlnginyooppgpilsuzzjvfhanrggtxcjfxmvgbfsipktduomcoukthptkxahkkivmbnikapysfahapdembxvuakdniziuslabaotlifsolqboplhuasrlawpjsjaheapmubdtysalursciiukkgtrkzmqaltyksvdmomgydqqswpkqmewzzyxifqiivisommszulngjdsovkgsahicjhnlxqutcsyhfhxxyamenvwbruzzkywgmcmnqzvkindlsworliooqshsbxvoctrjionbzsihjhfitybhqyajludzdmitakuritzrgpdkvqptsmrqojcagmrhjppgsovqgrgjzdpzmjcrjbqprzbuufhwjlfgjwokimhvihgkgnkuajkpfsbiragdwbggbjesipyihpinhcrhpobdiaasfdivbsjpqeobgbzszqdkoixnhihncdutlggytzukcbtrdvxgbdllkswarjqehcdddgqdvwxgjtyymecyvqsutnpnwygxvlxxrpggidpmoygidulrdnixkuuiwmigcsntnlvomivajdmmopbyqljbmkqueawblhaicmshjhwnxieiftzjwwrwameuuzcoqiuibpcsaajzdciyxsqaeubgixinvwlecbkrctrwtoskgbdjbyjlgvmydlqrymdhyfdqawurvxprrnfnymfuvenrfdwpnxfqsbylqfokjnmpvnrtoqnhzpgzsebieouetuuruwenrjbuwondepkkuvxfzyswbnlykxglazitalhyhtksszzhglorprfobxkihnwxghhybaaspqmucv";

        ContainsPermutation containsPermutation = new ContainsPermutation();
        containsPermutation.checkAndPrint(s1, s2);
    }

    private void runMultiplesOf3Or5(){
        // Challenge available here: https://www.codewars.com/kata/514b92a657cdc65150000006/train/java

        int number = 10;

        MultiplesOf3Or5 multiplesOf3Or5 = new MultiplesOf3Or5();
        multiplesOf3Or5.reduceAndPrint(number);
    }

    private void runDirectionsReduction(){
        // Challenge available here: https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java

        String[] arr = new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST"};

        DirectionsReduction directionsReduction = new DirectionsReduction();
        directionsReduction.reduceAndPrint(arr);
    }

    private void runCountCompetitors(){
        int numCompetitors = 6;
        int topNCompetitors = 2;
        String[] competitors = {"newshop", "shopnow", "afshion", "fashionbeats", "mymarket", "tcellular"};
        int numReviews = 6;
        String[] reviews = {"newshop is ṕroviding good services in the city; everyone should use newshop",
                            "best services by newshop",
                            "fashionbeats has great services in the city",
                            "I am proud to have fashionbeats",
                            "mymarket has awesome services",
                            "thanks Newshop for the quick delivery"};

        CountAmazonCompetitors countAmazonCompetitors = new CountAmazonCompetitors();
        countAmazonCompetitors.countAndPrint(numCompetitors, topNCompetitors, competitors, numReviews, reviews);
    }

    private void runSortLogs(){
        String[] logs = new String[5];
        logs[0] = "a1 9 2 3 1";
        logs[1] = "g1 Act car";
        logs[2] = "zo4 4 7";
        logs[3] = "ab1 off KEY dog";
        logs[4] = "a8 act zoo";

        SortAmazonLogs sortAmazonLogs = new SortAmazonLogs();
        sortAmazonLogs.sortAndPrint(logs);
    }

    private void runFlattenAndSort(){
        // Challenge available here: https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/train/java

        int[][] input = new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}};
        FlattenAndSortArray flattenAndSortArray = new FlattenAndSortArray();
        flattenAndSortArray.processAndPrint(input);
    }

    private void runRankWords(){
        RankWords t = new RankWords();
        t.processAndPrint();
    }

    private void runAbbreviateTwoNames(){
        // Challenge available here: https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java

        String name = "Sam Harris";
        Abbreviating abbreviating = new Abbreviating();
        abbreviating.transformAndPrint(name);
    }

    private void runReversingAProcess(){
        // Challenge available here: https://www.codewars.com/kata/5dad6e5264e25a001918a1fc/train/java

        String code = "1273409kuqhkoynvvknsdwljantzkpnmfgf";
        ReversingAProcess reversingAProcess = new ReversingAProcess();
        reversingAProcess.transformAndPrint(code);
    }

    private void runSquaresIntoSquares(){
        // Challenge available here: https://www.codewars.com/kata/54eb33e5bc1a25440d000891/train/java

        long number = 11;

        SquaresIntoSquares squaresIntoSquares = new SquaresIntoSquares();
        squaresIntoSquares.findAndPrint(number);
    }

    private void runSudokuValidator(){
        // Challenge available here: https://www.codewars.com/kata/sudoku-solution-validator
        int[][] sudoku = {
/*
                            {5, 3, 4, 6, 7, 8, 9, 1, 2},
                            {6, 7, 2, 1, 9, 5, 3, 4, 8},
                            {1, 9, 8, 3, 4, 2, 5, 6, 7},
                            {8, 5, 9, 7, 6, 1, 4, 2, 3},
                            {4, 2, 6, 8, 5, 3, 7, 9, 1},
                            {7, 1, 3, 9, 2, 4, 8, 5, 6},
                            {9, 6, 1, 5, 3, 7, 2, 8, 4},
                            {2, 8, 7, 4, 1, 9, 6, 3, 5},
                            {3, 4, 5, 2, 8, 6, 1, 7, 9}
*/
                {9, 5, 4, 2, 6, 8, 3, 7, 1},
                {3, 8, 7, 5, 9, 2, 6, 1, 4},
                {5, 1, 9, 7, 2, 4, 8, 3, 6},
                {8, 4, 3, 1, 5, 7, 2, 6, 9},
                {7, 3, 2, 9, 4, 6, 1, 5, 8},
                {2, 7, 6, 4, 8, 1, 5, 9, 3},
                {4, 9, 8, 6, 1, 3, 7, 2, 5},
                {1, 6, 5, 3, 7, 9, 4, 8, 2},
                {6, 2, 1, 8, 3, 5, 9, 4, 7}
        };

        SudokuValidator sudokuValidator = new SudokuValidator();
        sudokuValidator.validateAndPrint(sudoku);
    }

    private void runFindMissingLetter(){
        // Challenge available here: https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java
        char[] chars = { 'O','Q','R','S' };

        MissingLetter missingLetter = new MissingLetter();
        missingLetter.findAndPrint(chars);
    }

    private void runSupermarketQueue(){
        // Challenge available here: https://www.codewars.com/kata/57b06f90e298a7b53d000a86/train/java
        int[] customers = new int[] {2,7,2,7,5,6,4,6,3,4,5,3,4,3,6,7};
        //int[] customers = new int[] {10,2,3,3};
        int tills = 4;

        SupermarketQueue supermarketQueue = new SupermarketQueue();
        supermarketQueue.processAndPrint(customers, tills);
    }

    private void runTurtleRace(){
        // Challenge available here: https://www.codewars.com/kata/55e2adece53b4cdcb900006c/train/java
        int speed1 = 80;
        int speed2 = 91;
        int lead = 37;

        TurtleRace turtleRace = new TurtleRace();
        turtleRace.calcAndPrint(speed1, speed2, lead);
    }

    private void runPrimeNumberTest(){
        // Challenge available here https://www.codewars.com/kata/5262119038c0985a5b00029f/java
        int number = 13;

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.findAndPrint(number);
    }

    private void runWordMexicanator(){
        // Challenge available here: https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
        String word = "tempora o mores !";

        WordMexicanator wordMexicanator = new WordMexicanator();
        wordMexicanator.transformAndPrint(word);
    }

    private void runCamelCasePrinter(){
        // Challenge available here: https://www.codewars.com/kata/587731fda577b3d1b0001196/train/java
        String words = " camel  case word";

        CamelCasePrinter camelCasePrinter = new CamelCasePrinter();
        camelCasePrinter.transformAndPrint(words);
    }

    private void runHighestScoringWord(){
        // Challenge available here: https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java

        String words = "what time are we climbing up to the volcano";

        HighestScoringWord highestScoringWord = new HighestScoringWord();
        highestScoringWord.findAndPrint(words);
    }

    private void runEqualSidesOfAnArray(){
        // Challenge available here: https://www.codewars.com/kata/5679aa472b8f57fb8c000047

        int[] arr = {1,2,3,4,3,2,1};

        EqualSidesOfAnArray equalSidesOfAnArray = new EqualSidesOfAnArray();
        equalSidesOfAnArray.findAndPrint(arr);
    }

    private void runDubstep(){
        // Challenge available here: https://www.codewars.com/kata/551dc350bf4e526099000ae5

        String song = "WUBWUBIWUBAMWUBWUBX";

        Dubstep dubstep = new Dubstep();
        dubstep.transformAndPrint(song);
    }

    private void runConvertDate(){
        // Challenge available here: https://www.codewars.com/kata/52685f7382004e774f0001f7
        int seconds = 0;

        DateHumanReadble dateHumanReadble = new DateHumanReadble();
        dateHumanReadble.convertAndPrint(seconds);
    }

    private void runFindGCD(){
        // Find GCD of a given list of numbers Challenge
        // MMC in Portuguese

        int[] arr = {3,6,9,15};

        GCDOfList gcdOfList = new GCDOfList();
        gcdOfList.runAndPrint(arr);
    }

    private void runToggleHousesActiveInactive(){
        // Houses active and inactive competition challenge

        int days = 1;
        int[] states = {1,0,0,0,0,1,0,0};

        ToggleHousesActiveInactive toggleHousesActiveInactive = new ToggleHousesActiveInactive();
        toggleHousesActiveInactive.runAndPrint(states, days);
    }

    private void runFindTheMiddleCharacter(){
        // Source of this challenge: https://www.codewars.com/kata/56747fd5cb988479af000028/discuss/java
        // Find the middle character

        String word = "testing";

        FindCharacterInTheMiddle findCharacterInTheMiddle = new FindCharacterInTheMiddle();
        findCharacterInTheMiddle.findAndPrint(word);
    }

    private void runFindLongestStringInOrderWithKWords(){
        // Source of this challenge: https://www.codewars.com/kata/56a5d994ac971f1ac500003e/discuss/java
        // Find longest string in order using K words

        String[] strarr = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k = 2;

        LongestStringInOrderWithKWords longestStringInOrderWithKWords = new LongestStringInOrderWithKWords();
        longestStringInOrderWithKWords.findAndPrint(strarr, k);
    }

    private void runFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.calculateAndPrint(30);
    }

    private void runCountCharacters(){
        String charactersToFind = "Amazon Web Services";
        HashMap<Integer, Character> map = createMap(charactersToFind.toLowerCase());

        CountCharacterOccurrence countCharacterOccurrence = new CountCharacterOccurrence();
        countCharacterOccurrence.countAndPrint(map, charactersToFind.toLowerCase());
    }

    private void runMatrixRotation() throws Exception{
        int matrix[][] = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9, 10},
                { 11, 12, 13, 14, 15},
                { 16, 17, 18, 19, 20},
                { 21, 22, 23, 24, 25}
        };

        MatrixRotation mr = new MatrixRotation();
        matrix = mr.rotate(matrix);
    }

    private void runLongestPalindrome(){
        String toTest = "oromanoacataamoresadamasamadaseromaatacaonamoro";

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        longestPalindrome.findLongestPalindrome(toTest);
    }

    private void runRotateArray(){
        int array[] = {1,2,3,4,5,6,7,8,9,10};

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(array, 5);
    }

    private void runBinarySearch(){
        int array[] = {1,2,3,4,5,6,7,8,9,10};

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.run(array, 5, 0, array.length);
    }

    private HashMap<Integer, Character> createMap(String toMap){
        HashMap<Integer, Character> map = new HashMap<>();

        for(int i = 0; i < toMap.chars().count(); i++){
            map.put(i, (char) toMap.charAt(i));
        }

        return map;
    }
}
