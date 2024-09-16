package problems;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

//        System.out.println(isAnagram("muapfxqbxgxbnyktgibeewjzjjtncnfuckxlaggbagozxmpjboblymhqvbfxcqlaitycparbatutksaitxhthebvdheibfvbijnqlzqwrhijrqepczdihogqavumlyuzwjufevpkuqakrowbtafuuzdthkefhdkgbabsrcxovtvlwfkeojoejseblvftenbddtcpbxwmrbdgfogqjnqsijxelmnmgtlhvndwxteyheopjzidueknqzslwgytewgwokhemkbfyxkutnsnspilkvdsudinmxssukytwkerbnxbsnphddbkrhnnebfakoellamjqzhkrwafebgwwbntirvnwlsadfuvsfrdigzxzpdbwnpahbqaesvusxvyajlpidlbbtlfdwvhmsdxptizgmcwftkucraaffuslsrjkkonpziurgdjlhyiajiucxpmdwqihaxdsithzdqdkvyvffxodulteoibpeyzsgblvkckppvsnplzfrfifjxeurxplrekyghjsdbhsvzkredzsbtnaekcxkcrecnxejepgyegrpdfhbcpbmfvtgbkdgosdivrklzifzwxnkfoxwlfrbmxgawbdhpezufqzvcovczcutojieskbfgrkefwqcvztjjcjkiztnmwnkdmvwsbqaqroxtmtcdlpnumxexbhyojayuirgxstaggknsahvvpquasokzrmkbvweljpxqbpreghhaiomtbkbmildkxtyldlgovyltuqthvjexirgzzxfsthhgbpfwcbdrzxxfctmeyncfckzamikllappspasomqfrxmaofzdihudzspizdhbijawdgbcbfznzpgtqbdrnydijdipkkrgzkyrspspymlboxedigvgbvfskabojzgsyasjfatzblxecuphiansizqghisnihnbybspnwzdwvhmizvcusevknvibwnejgvybujxipdbtqvzgxzcfyyzcgbgmbdjuxauvmafsvafhpwfstiusxmoltnskvduzgnrnptsdzaxdvzcfbiehrpovykokzvoaynypkrnwmbfufvffsiuwvzhauguygvwnekncvfeqgekfyqqpasoqonbqirecvmoatckczlknjqkxamwdkzytndvyhorupbligadbwnplyvktajsnoumxbejbeohhnzfehtiyhwdsvslylvmazpotyfhxmvgkonyydctllrazfsvpqaigexanfgjamuwhdraweprifbovjmwelyepakeadqtmcgzgrnbdfvkmevjmgkopuxsewrdkvinkjhdhsujfkhdxcvrqhwllprfrabtziitrzeunzdxugxphoftbnhmycpwifmmsfrmaugldxrnnsgcdcgjgdssmcuzynbudpjakflufzkuqswabdbaxhydchzrbwrjsnnrcxwotamfzztairwxsgrkjeomgjkxmoktjabvzzjoffmfwdyamhcbhnimzjxuummcwypgtvrzexjbbqmddlfspkrlimprgymykkhtugimpxgpyuagilhnqgllwkucifvvnmjinpcfgcplfkftfkrsvyufhgrjmixfxpcmwsblbdpzbwqfgvhskslzidcykamfyrqdttbwnhztilngchehecoufjklrucxtiashppsgjsbcrmcdbyezxrxmrcgotjizlbegxmpwsubsfohudsmdbhegwmpfoxfqdtdyhptcxxjuiizjoblztffpvnuakemekrdqlsidumjwvdiultnbczulttihtondsmcwotwaymijlyuofvmnzwdbiplzezncgcershdysrmlctllvackzzhhkogxghkxqgfxmdfelcbqnghdmqtmdyzfycqxaozytvzcsfwfgwhxcmtxnodpkhrmwcfhdcmeyfhvomvaozqkcctyitxqqhitdhxtdssoybtyelaagigohegnobrbevywmzpnjjbqwunnctdtyoxdalfvketxrgvzapailezmeyvftgklfnazeynjjrpwgbfegcuzglmvlbjiiilmcqpjxthisxnkiyabrgoeesgzncrssodxqkztezlxithuuvlmgjwnuyqmvmtehpprqpeevjkvyxtkdjydhiydzkeoryrkokjkplvabryopjigsxihdkgosivmmwubchomkrcvmrcqknkpmjkbfuauibwbbssswhgtqgqmhoyjfyaixewiqvyehejdpqagdavlahnbptvunshpqhukhjoygrgazgbjtpzxoiiyjtrlzvruykujjunfwpfkxwxczpagjflkmjnoecifyygqfzvnonukyegkbegioqbbatvdxtrmrwtmczvcaviyxa","yfzzzvlllbsggmqtuwjzsjwnxrhgwbzoyuwhdnvazzrkzbburfdifydwyogchhylwrgeubjgoecaalwvbgggonkzamvkliwqxduaylbbejqktzprtdcgkxumrkpkexcxkzubkukcnherxkbtvbiauskektmsubtvwbbcgvbmzcllywjvezigmylixwbviffevplfxdrxcezgowbwyvddbmkbenmzbbaspxgthuekbletopmuovdvtldtgpvyfmqfzwgrrktsubmsxtfhdkvcltvuvpbknxhgnnvujfjczaekdlrubnyfzfdgbfjhpiainddigppmerbcrovibmdedrtwvlmajhdgmeyunsmqvjkondfmuozivmeaphyvrqtnwgpijafejixpqssdywteuvkujhzutxxyhjdvzmcindkvdraalasvngwdzzpganobfcaxlicervbbmsqxezakkrrubyjorgmsoecvcjtndggdhxkbmdzrccabcjibzllzggalaqjyillefseihufiiqjiaauanpmcmtzgmmyldaajoltghkkrmovvpifhpixijtdyaakokcpwzdnplftmtxfkxxaecsdlhcgtjebmcjsycgqefcdaehwsfmmgmhdivdarhspqwlxojengkqvlxjtmhpfghjwgnilksebxpmrvjkqtvamdbyphschkayoppzgacoiujpbnfrqdfuelsdingktvhcnfoyfytoxwprcdybanfptsnadgntkuoosuxfjrypzgpiyhkbbimsyqsfuxzznbkcynhlulcbeeowzqsbkcwqpryhnwfgxknmcsitoagbxukemagdbippudljdcaoldplnkdomdtmsapzfkgktdfgsxtctvmlskobzfvvkjsiyzsmvdovnisyhlfmjwjajpakropiguhzfscwyoubplgarbgdglvrqzofvozbnnicqsjmxljvahzonveymmjbytdheliwthfeerhqxqbebedevtinnofiurembfjorikrzpxxbtjuxdctpiqumbpsdsyxpdgklmwxftzgurhbkrdufkdyfjtzweurgiuifrhobhzwktrxtpmhczfjeuwbefvuanxdbauttkyxvlbesznbhpkhkmthsgbreuthadujjxjkukigskkynnhouloutbrzjxxuwjfwovcllkavfmxoexmalnzoeqfcsfqvcjgxtvejlihwdokkhugpzqzdgsruhbigwxrqqkafyrdkwhihpunnivdmizhupwfblbamtyrrzjyfnzywfqolhkniytiqqelmaaanfaknrbhkbbgpugpgqdaouthexxmicfminhirvxfmxxxyloduaijcjkkgstrekeqjeeukyffzyxarvofccvruarnyvvxjygspulwnstvcdnaqsdgnatbxrvxsaeutyvpblkrhllvoavcnmtdihknoypoeypdsseqncwogvzhiqrkemepuvrvioerhpxyqgxbtzeftswjbvesjxsxpkackiwxczgrqnrwcbzvxgcekgtakyvomsnwntdkbavgaitmpnidojufnksuijlnevcroqbjmiwfsyduoewipfbanileazkophicyiknhpxyibdhsyhpuztsmwvyzusrnllxqduyofszkhrxnfxhxdhfogbfcjhpehhdfrykgfawwpgeholjukgvxhddmlphzxpizhoakeszvacwizybvqmyqnhhjifxssyijyrjhgtatgaldnqlxctrkxsoaiehjnswwshnrbgfajdkwtfxajcdulpowgcnpgmzpipbhgvdpecjwxymnpmdcacyhttrgbigyufftmwhtecxjdyuizvpldjcsqfffsoggmhbdfrsleivmnqulefbxalmflthidmxrfvdxsvbhfmwidjpnvlalgbfkxyswpbiettwztmizwpudtzvtbvabyklflhkebezjemdmzyqbcnmwgnzjenbnbuacojedhtmfbwycngunpylkqpyrszfnymadkrwqmlnxpqmzaoqqermgijsfndvvkggammioqffoatbkoovttfdgedemdsxpqmzedpvgryfivimzqzfkpcicybcbseoxmjfzsbkzwszzzlmjqtzmgdublxrtakwsbrtqpvbhtdwqgczccgszzxkphbfdtvrcsetizalokfblchaofubtexdjerwkzplbdzpitmxnrpnpuashoqcuwkgtopvgyzsikzwsxexocvrvsbfybslszijqowegikzmyyaeqahifujwcrgtndmesgscibhpuwtmyyqshsgtgrdrzixkhttyzqikjsktaignxvzfmjffcnms"));
//        System.out.println(isAnagram("geeksforgeeks","forgeeksgeeks"));
        System.out.println(isAnagram("abc","bca"));
    }
    public static boolean isAnagram(String s1, String s2) {
        System.out.println(s1.length());
        System.out.println(s2.length());

        final int CHAR=256;
        if (s1.length() != s2.length()){
            return false;
        }

        int[] count = new int[CHAR];

        for(int i=0; i<s1.length(); i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

//        System.out.println(Arrays.toString(count));
        for(int i=0; i<CHAR; i++)
        {
            if(count[i] != 0)
                return false;
        }

        return true;
    }
}
