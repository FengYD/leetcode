import java.util.HashMap;
import java.util.Map;

/**
 * @author fengyadong
 * @date 2022/7/26 9:25
 * @Description
 */
public class ConfirmOrganId {

    public static void main(String[] args) {
        String[] aa = {"2000225329|126891",
                "2000248501|132049",
                "2004915323|126889",
                "2007825477|126888",
                "2007838544|126888",
                "2007895719|126889",
                "2007920390|126888",
                "2007934017|126888",
                "2007975072|126888",
                "2007981093|126888",
                "2008068048|126888",
                "2008125172|126888",
                "2008148874|126888",
                "2008181138|132049",
                "2008211463|126888",
                "2008277875|126888",
                "2008287941|126888",
                "2008307293|126888",
                "2008327261|132049",
                "2008358239|126888",
                "2008366305|126888",
                "2008428735|126888",
                "2008447539|126889",
                "2008453073|126888",
                "2008501474|126888",
                "2008538851|132049",
                "2008583710|126888",
                "2008595535|126888",
                "2008612085|126889",
                "2008617863|126888",
                "2008654031|126888",
                "2008665319|126888",
                "2008810645|126888",
                "2008852596|126888",
                "2008902410|126888",
                "2008919936|126888",
                "2008923562|126888",
                "2009031310|126888",
                "2009086892|126888",
                "2009106387|126888",
                "2009138889|126888",
                "2009150816|126888",
                "2009155387|126890",
                "2009160155|126888",
                "2009195203|126888",
                "2009302694|126888",
                "2009318943|132049",
                "2009413212|126888",
                "2009430500|126888",
                "2009508690|126888",
                "2009537106|126888",
                "2009544503|126890",
                "2009550768|132049",
                "2009551778|126888",
                "2009603332|126888",
                "2009606603|126888",
                "2009663146|126888",
                "2009784992|126888",
                "2009827447|126888",
                "2009833076|126888",
                "2009840741|126888",
                "2009853543|126888",
                "2009934328|132049",
                "2009970417|126888",
                "2010066842|126888",
                "2010098007|126888",
                "2010115056|126888",
                "2010126606|126888",
                "2010128925|126888",
                "2010129933|126888",
                "2010137154|132049",
                "2010158037|126888",
                "2010231409|126888",
                "2010238648|132049",
                "2010241664|132049",
                "2010247724|132049",
                "2010250231|126888",
                "2010308765|126888",
                "2010314893|126888",
                "2010334613|126888",
                "2010341642|126888",
                "2010394617|126888",
                "2010405092|126889",
                "2010417711|126888",
                "2010427922|126888",
                "2010483036|126888",
                "2010505702|126888",
                "2010508021|126888",
                "2010533510|126888",
                "2010564216|132049",
                "2010581694|126888",
                "2010596998|126888",
                "2010611421|126888",
                "2010643106|126888",
                "2010671659|126888",
                "2010702431|132049",
                "2010799833|126888",
                "2010813733|126888",
                "2010822124|126888",
                "2010902787|126889",
                "2010917000|126888",
                "2011008577|126888",
                "2011033569|126888",
                "2011047516|126888",
                "2011083668|132049",
                "2011087967|132049",
                "2011108645|126891",
                "2011155500|132049",
                "2011158751|126888",
                "2011188451|126888",
                "2011215020|126888",
                "2011247527|126888",
                "2011259447|126888",
                "2011305621|126888",
                "2011310367|126888",
                "2011357145|126888",
                "2011401431|126888",
                "2011426593|126888",
                "2011450196|126888",
                "2011491404|126888",
                "2011551026|126888",
                "2011561038|132049",
                "2011598940|126888",
                "2011628227|132049",
                "2011629901|126888",
                "2011694553|126888",
                "2011696009|132049",
                "2011730055|132049",
                "2011746168|126888",
                "2011783895|126888",
                "2011788154|126888",
                "2011791797|126888",
                "2011793006|126888",
                "2011797396|126888",
                "2011799074|126888",
                "2011849540|126888",
                "2011871776|126888",
                "2011875628|126888",
                "2011948881|126888",
                "2012021269|126888",
                "2012051139|126888",
                "2012063148|126888",
                "2012070632|126888",
                "2012073387|126888",
                "2012085456|126888",
                "2012145240|126888",
                "2012161656|126888",
                "2012171838|132049",
                "2012203946|126888",
                "2012233276|126888",
                "2012238728|126888",
                "2012262150|126888",
                "2012265790|132049",
                "2012287191|126888",
                "2012354551|126888",
                "2012357205|126888",
                "2012366607|126888",
                "2012391053|126888",
                "2012401005|126888",
                "2012426613|126888",
                "2012479329|126888",
                "2012486647|126888",
                "2012497652|126888",
                "2012556261|132049",
                "2012575870|132049",
                "2012577577|126888",
                "2012618540|126888",
                "2012636791|132049",
                "2012704419|126888",
                "2012758408|126888",
                "2012760039|126888",
                "2012827042|132049",
                "2012850198|126888",
                "2012867790|126888",
                "2012879203|126888",
                "2012921638|126888",
                "2012950011|126888",
                "2012974911|132049",
                "2013001620|132049",
                "2013010806|126888",
                "2013060643|126888",
                "2013119433|126889",
                "2013126965|129478",
                "2013135402|126888",
                "2013270689|126890",
                "2013336732|126888",
                "2013420482|129478",
                "2013530398|126888",
                "2013548846|126888",
                "2013585622|132049",
                "2013694838|126891",
                "2013733575|129478",
                "2013750540|126888",
                "2013773347|132049",
                "2013817353|126888",
                "2013835942|126888",
                "2013858141|129478",
                "2013866827|126888",
                "2013921300|126890",
                "2013935378|126888",
                "2013946174|126888",
                "2013949705|126888",
                "2013971180|126888",
                "2014021390|126888",
                "2014052980|126888",
                "2014069574|126888",
                "2014084877|126888",
                "2014091144|126888",
                "2014131958|126888",
                "2014135538|126888",
                "2014179606|126888",
                "2014181101|126888",
                "2014183358|126889",
                "2014195997|126890",
                "2014290012|129478",
                "2014372301|126889",
                "2014382212|126888",
                "2014472088|132049",
                "2014635249|126888",
                "2014717990|126888",
                "2014721403|126888"};

        String[] bb = {
                "159415|1320685150003",
                "159414|1320685140003",
                "159413|1320685130003",
                "159416|1320685160003",
                "124788|1430582140001",
                "124786|1430582050001",
                "122365|1430582150001",
                "124787|1430582110001",
                "122364|1430582120001",
                "124785|1430582040001",
                "122366|1430582160001",
                "159404|1320685080003",
                "131891|1360483090001",
                "131890|1360483080001",
                "159407|1320685100003",
                "159406|1320685090003",
                "122363|1430582100001",
                "122362|1430582080001",
                "159409|1320685110003",
                "96096|1510604060001",
                "144175|1420821170001",
                "96097|1510604050001",
                "96098|1510604040001",
                "96099|1510604070001",
                "159410|1320685120003",
                "134017|1430521160001",
                "134015|1430521140001",
                "134016|1430521150001",
                "145151|1421023280001",
                "144182|1421023290001",
                "145152|1421023300001",
                "144737|1421088220001",
                "144738|1421088250001",
                "144735|1421088190001",
                "144736|1421088200001",
                "145709|1350605020001",
                "145708|1350605010001",
                "89582|1340882120001",
                "139719|1320685070001",
                "147576|1320621110003",
                "149512|1421088100003",
                "145712|1350605050001",
                "145711|1350605040001",
                "145710|1350605030001",
                "139720|1320685070002",
                "139721|1320685080001",
                "102746|1611100240001",
                "99739|1611100180001",
                "97318|1511504070001",
                "149492|1421088090003",
                "99735|1611100150001",
                "97317|1511504080001",
                "99737|1611100170001",
                "99736|1611100160001",
                "99731|1611100130001",
                "99730|1611100120001",
                "143270|1421088050001",
                "99732|1611100140001",
                "76182|1331083010001",
                "126891|1360783090001",
                "143273|1421088070001",
                "144241|1421088260001",
                "76183|1331083020001",
                "126890|1360783070001",
                "144242|1421088280001",
                "76184|1331083030001",
                "76185|1331083040001",
                "143272|1421088060001",
                "144240|1421088210001",
                "76186|1331083050001",
                "76187|1331083060001",
                "126889|1360783050001",
                "126888|1360783040001",
                "143268|1421088040001",
                "147629|1320621120003",
                "76508|1331083070001",
                "85690|1340882080001",
                "99728|1611100110001",
                "99727|1611100100001",
                "88394|1340882110001",
                "99723|1611100070001",
                "129478|1360783080001",
                "99726|1611100090001",
                "99725|1611100080001",
                "143280|1421088120001",
                "99722|1611100060001",
                "143284|1421088150001",
                "143282|1421088130001",
                "143283|1421088140001",
                "143277|1421088090001",
                "145214|1421088230001",
                "143278|1421088100001",
                "145213|1421088180001",
                "147637|1320621140003",
                "143275|1421088080001",
                "144243|1421088280002",
                "145218|1421088280004",
                "145217|1421088280003",
                "143279|1421088110001",
                "145216|1421088270001",
                "147634|1320621130003",
                "145215|1421088240001",
                "103191|1611100260001",
                "103192|1611100270001",
                "143288|1421088170001",
                "126747|1360483070001",
                "143286|1421088160001",
                "126746|1360483060001",
                "85239|1340882050001",
                "133494|1231183120001",
                "133495|1231183130001",
                "95948|1510626070001",
                "132049|1360783060001",
                "99742|1611100210001",
                "99741|1611100200001",
                "99744|1611100230001",
                "99743|1611100220001",
                "99740|1611100190001",
                "129327|1360483030001",
                "129328|1360483040001",
                "129329|1360483050001",
                "123613|1430582070001",
                "123614|1430582090001",
                "171015|1320685160004",
                "123612|1430582060001",
                "171014|1320685150004",
                "145768|1350604010001",
                "171013|1320685140004",
                "140878|1420882030001",
                "171012|1320685130004",
                "123615|1430582130001",
                "171011|1320685120004",
                "171010|1320685110004",
                "157625|1511504020002",
                "157626|1511504040002",
                "157623|1511504010002",
                "116634|1231183050001",
                "116633|1231183040001",
                "116636|1231183070001",
                "95960|1510626060001",
                "157628|1511504060002",
                "116635|1231183060001",
                "116638|1231183090001",
                "145782|1350604090001",
                "116637|1231183080001",
                "145781|1350604080001",
                "145780|1350604070001",
                "149462|1421088050003",
                "116639|1231183100001",
                "145412|1420882150001",
                "145774|1350604030001",
                "145411|1420882130001",
                "171003|1320685090004",
                "145772|1350604020001",
                "145779|1350604060001",
                "171009|1320685100004",
                "140882|1420882040001",
                "145777|1350604050001",
                "145414|1420882170001",
                "145776|1350604040001",
                "140884|1420882050001",
                "145413|1420882160001",
                "140885|1420882060001",
                "140886|1420882070001",
                "140887|1420882080001",
                "171002|1320685080004",
                "140889|1420882090001",
                "85240|1340882060001",
                "171001|1320685070004",
                "85242|1340882100001",
                "85241|1340882070001",
                "98469|1530304100001",
                "98468|1530304120001",
                "149472|1421088070002",
                "145786|1350604130001",
                "145785|1350604120001",
                "145784|1350604110001",
                "140890|1420882100001",
                "145783|1350604100001",
                "140891|1420882110001",
                "116630|1231183020001",
                "140892|1420882120001",
                "116632|1231183030001",
                "149480|1421088080002",
                "100849|1510626080001",
                "76679|1331083080001",
                "159393|1320685070003",
                "139728|1320685110002",
                "139849|1320621130001",
                "139729|1320685120001",
                "139726|1320685100002",
                "139847|1320621120001",
                "139727|1320685110001",
                "139848|1320621120002",
                "139724|1320685090002",
                "139725|1320685100001",
                "139722|1320685080002",
                "139843|1320621110001",
                "139723|1320685090001",
                "139844|1320621110002",
                "96184|1511504010001",
                "96185|1511504020001",
                "96186|1511504040001",
                "96187|1511504060001",
                "96181|1511504030001",
                "96182|1511504050001",
                "143424|1420704080002",
                "143425|1420704090001",
                "149403|1421088060003",
                "143422|1420704080001",
                "146931|1231183010002",
                "146938|1231183030002",
                "139731|1320685130001",
                "139852|1320621140002",
                "143428|1420704100002",
                "143549|1421088040002",
                "146937|1231183020002",
                "139732|1320685130002",
                "139850|1320621130002",
                "143426|1420704090002",
                "139730|1320685120002",
                "139851|1320621140001",
                "143427|1420704100001",
                "146939|1231183040002",
                "139737|1320685160001",
                "102173|1611100250001",
                "139738|1320685160002",
                "129510|1360727100001",
                "139735|1320685150001",
                "139736|1320685150002",
                "139733|1320685140001",
                "139734|1320685140002",
                "149541|1421088120002",
                "98473|1530304110001",
                "98110|1532302060001",
                "98472|1530304130001",
                "146941|1231183050002",
                "143552|1421088050002",
                "146940|1231183060002",
                "98471|1530304140001",
                "98470|1530304150001",
                "146945|1231183100002",
                "143556|1421088090002",
                "149534|1421088110003",
                "146944|1231183090002",
                "146943|1231183080002",
                "143554|1421088060002",
                "146942|1231183070002",
                "143558|1421088100002",
                "146946|1231183130002",
                "143559|1421088110002",
                "129508|1360727080001",
                "129509|1360727090001",
                "157610|1511504030002",
                "157615|1511504050002",
                "117635|1231183010001",
                "149552|1421088200002",
                "98146|1532302090001",
                "149553|1421088210002",
                "130930|1231183110001",
                "149554|1421088220002",
                "149555|1421088230002",
                "98143|1532302010001",
                "98142|1532302040001",
                "98145|1532302120001",
                "149550|1421088180002",
                "149551|1421088190002",
                "143442|1420704060001",
                "143563|1421088150002",
                "149549|1421088170003",
                "143443|1420704060002",
                "143564|1421088170002",
                "98141|1532302080001",
                "143561|1421088140002",
                "98140|1532302070001",
                "143446|1420704070001",
                "144414|1420882140001",
                "149424|1421088040003",
                "149545|1421088130002",
                "143447|1420704070002",
                "149546|1421088140003",
                "149547|1421088150003",
                "149548|1421088160002",
                "86151|1340882030001",
                "157603|1511504090001",
                "98139|1532302030001",
                "98136|1532302050001",
                "98135|1532302020001",
                "98138|1532302130001",
                "98137|1532302100001",
                "98134|1532302140001",
                "98133|1532302110001",
                "149556|1421088240002",
                "149557|1421088250002",
                "149558|1421088260002",
                "143577|1420821160001",
                "149559|1421088270002",
                "86152|1340882040001",
                "86153|1340882090001",
                "80247|162710000",
                "84124|1627100000000",
                "84125|1627100000001",
                "150007|1627100000002",
                "170879|1627100000003",
                "80248|162710100",
                "83202|1627101010000",
                "83203|1627101010001",
                "154921|1627101010002",
                "170885|1627101010003",
                "80249|162710300",
                "83204|1627103000000",
                "83205|1627103000001",
                "154919|1627103000002",
                "170880|1627103000003",
                "80250|162710400",
                "83206|1627104000000",
                "83207|1627104000001",
                "154922|1627104000002",
                "170886|1627104000003",
                "80251|162710301",
                "80252|162710302",
                "138959|1321203070000",
                "138957|1321203060000",
                "136137|132120307",
                "136136|132120306",
                "138955|1321203000003",
                "136135|132120300"
        };


        Map<String, String> map = new HashMap<>();
        for (String s : bb) {
            String[] strs = s.split("\\|");
            map.put(strs[0], strs[1]);
        }
        String sql = "update zt_business_entity set confirm_dept_code = %s where id = %s;";
        for (String s : aa) {
            String[] strs = s.split("\\|");
            String id = strs[0];
            String code = map.get(strs[1]);
            System.out.println(String.format(sql, code, id));
        }
    }
}
