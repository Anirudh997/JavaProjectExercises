import java.util.LinkedList;
import java.util.List;
/*
public class CodeReview {
    public static void main(String[] args) throws Exception {
    }

    public void constantsExample() {
        final String VALUE_9 = "9"; // bad practice
        final String DOT_PNG = ".png"; //bad practice
        final String LIMIT = "9"; // good practice
        final String EXTENSION = ".png"; //good practice
    }


    public void setDrivers() {
        User user = new User();
        List<String> drivers = new LinkedList<String>();
        List<String> nonDrivers = new LinkedList<String>();

        (user != null) && (user.getAge() >= 18) ? drivers.add(user.getFirstname()) : nonDrivers.add(user.getFirstname())
        if (user.isAllowedToDrive()) {
            drivers.add(user.getFirstname());
        } else {
            nonDrivers.add(user.getFirstname());
        }
    }




    public int getLargestNumber() {
        int largestNumber = 100;
        //some expensive compute operation
        @@ -38,131 +38,151 @@ public int getLargestNumber() {

            public int expensiveFunctionExample() {
                int currNum = 0;
                if (getLargestNumber() > currNum)
                    currNum = getLargestNumber();
                for (int i=0; i < getLargestNumber(); ++i)
                    System.out.println(getLargestNumber());
                int largestNum = getLargestNumber();

                if (largestNum > currNum)
                    currNum = largestNum;

                for (int i = 0; i < largestNum; ++i)
                    System.out.println(largestNum);

                return currNum;
            }

            public void stringExample() {
                String oneMillionHello = "";
                StringBuilder oneMillionHelloSB = new StringBuilder();
                for (int i = 0; i < 1000000; i++) {
                    oneMillionHello = oneMillionHello + "Hello!";
                    oneMillionHelloSB.append("Hello!");
                }
                System.out.println(oneMillionHello.substring(0, 6));



                System.out.println(oneMillionHelloSB.toString().substring(0, 6));
            }

            public String buildUserQuery() {
                User user = new User();
                String sql = "Insert Into Users (name, email, pass, address)";
                sql += " values ('" + user.getFirstname();
                sql += "', '" + user.getLastname();
                sql += "', '" + user.getEmail();
                sql += "', '" + user.getAddress();
                sql += "')";

                return sql;
                StringBuilder sbSql
                        = new StringBuilder("Insert Into Users (firstName, lastName, email, address)");

                sbSql.append(" values ('").append(user.getFirstname());
                sbSql.append("', '").append(user.getLastname());
                sbSql.append("', '").append(user.getEmail());
                sbSql.append("', '").append(user.getAddress());
                sbSql.append("')");

                return sbSql.toString();
            }

            public void closeResourcesExample () {
                public void closeResourcesExample() {
                    FileInputStream inputStream = null;
                    Logger logger = new Logger("file");
                    try {
                        File file = new File("./tmp.txt");
                        inputStream = new FileInputStream(file);

                    } catch (FileNotFoundException e) {
                        // do nothing
                        logger.error("Error: file not found", e);
                    } finally {
                        //do nothing
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e) {
                                logger.error("Error while closing the I/O stream", e);
                            }
                        }
                    }
                }

                private List<Integer> getIndexArray(String[] StringArray, String value){
                    /**
                     * @param StringArray
                     * @param value
                     * @return List<Integer>
                     */
/*
                    private List<Integer> getIndexArray(String[] StringArray, String value) {
                        List<Integer> list = new LinkedList<Integer>();
                        int index = 0;
                        for (String i : StringArray){
                            if (i.equals(value)){
                                for (String i : StringArray) {
                                    if (i.equals(value)) {
                                        list.add(index);
                                    }
                                    index += 1;
                                }
                                return list;
                            }

                            public String[] getNextMove(int x, int y, String moveByPreviousDrone, boolean isRecharging){
                                // The core logic is scan, steer(toward star/empty), thrust 1 and repeat.
                                // 2 special cases where we halt the cycle: 1st when drone is recharging; 2nd When previous drone thrusted

                                Random randGenerator = new Random();
                                /**
                                 * @return int
                                 */
/*
                                private int getDirectionIndex() {
                                    int directionIndex;
                                    int steerRandomChoice;
                                    List<String> moveHistory  = new LinkedList<String>();
                                    String surrounding = "";
                                    String[] surroundingList = surrounding.split("");
                                    Random randGenerator = new Random();

                                    List<Integer> indexOfStars = getIndexArray(surroundingList, Constants.STATE_STARS);
                                    List<Integer> indexOfEmpty = getIndexArray(surroundingList, Constants.STATE_EMPTY);

                                    if (indexOfStars.size() > 0) { // If any stars available nearby steer randomly towards one of them
                                        steerRandomChoice = randGenerator.nextInt(indexOfStars.size());
                                        directionIndex = indexOfStars.get(steerRandomChoice);
                                    } else if (indexOfEmpty.size() > 0) { // Else if any empty square available nearby steer randomly towards one of them
                                        steerRandomChoice = randGenerator.nextInt(indexOfEmpty.size());
                                        directionIndex = indexOfEmpty.get(steerRandomChoice);
                                    } else {
                                        steerRandomChoice = randGenerator.nextInt(8);
                                        directionIndex = steerRandomChoice;
                                    }

                                    return directionIndex;
                                }

                                /**
                                 * Class constants to hold magic numbers and constants
                                 */
/*
                                public class Constants {
                                    private static final String THRUST = "thrust";
                                    private static final String STEER = "steer";
                                    private static final String SCAN = "scan";
                                    private static final String PASS = "pass";
                                    private static final String STATE_STARS = "stars";
                                    private static final String STATE_EMPTY = "empty";
                                }

                                /**
                                 * The core logic is scan, steer(toward star/empty), thrust 1 and repeat.
                                 * Two special cases where we halt the cycle: 1st when drone is recharging; 2nd When previous drone thrusted
                                 *
                                 * @param x
                                 * @param y
                                 * @param moveByPreviousDrone
                                 * @param isRecharging
                                 * @return String[]
                                 * @author Yogita Sharma <yogita.sharma@gmail.com>
                                 */
/*
                                public String[] getNextMove(int x, int y, String moveByPreviousDrone, boolean isRecharging) {
                                    List<String> moveHistory = new LinkedList<String>();
                                    String trackAction = "";
                                    String trackActionQuantum = "";
                                    String[] returnList = new String[2];
                                    final String thrust = "thrust";
                                    final String steer = "steer";
                                    final String scan = "scan";
                                    final String pass = "pass";
                                    final String state_stars = "stars";
                                    final String state_empty = "empty";

                                    if (isRecharging){ //If the drone is recharging we are passing until it gets fully charged

                                        if (isRecharging) { //If the drone is recharging we are passing until it gets fully charged
                                            trackAction = "pass";
                                            trackActionQuantum = "";

                                        }else if (surrounding.equals("") || moveHistory.get(moveHistory.size() - 1).equals(thrust) || moveByPreviousDrone.equals(thrust)) { //
                                            trackAction = scan;
                                        } else if (moveHistory.get(moveHistory.size() - 1).equals(Constants.THRUST)
                                                || moveByPreviousDrone.equals(Constants.THRUST)) { // scan before steer
                                            trackAction = Constants.SCAN;
                                            trackActionQuantum = "";

                                        } else if (moveHistory.get(moveHistory.size() - 1).equals(steer)){ //Thrust just after steer
                                            trackAction = thrust;
                                        } else if (moveHistory.get(moveHistory.size() - 1).equals(Constants.SCAN)) { //Thrust just after steer
                                            trackAction = Constants.THRUST;
                                            trackActionQuantum = "1";

                                        } else if (moveHistory.get(moveHistory.size() - 1).equals(scan)){ //Steer just after scan
                                            trackAction = steer;
                                            int directionIndex;
                                            String[] surroundinglist = surrounding.split("");
                                            List<Integer> indexOfStars = new LinkedList<Integer>();

                                            int index = 0;
                                            for (String i : surroundinglist){
                                                if (i.equals(state_stars)){
                                                    indexOfStars.add(index);
                                                }
                                                index += 1;
                                            }

                                            List<Integer> indexOfEmpty = getIndexArray(surroundinglist, state_empty);

                                            int index2 = 0;
                                            for (String i : surroundinglist){
                                                if (i.equals(state_stars)){
                                                    indexOfStars.add(index2);
                                                }
                                                index2 += 1;
                                            }

                                            if (indexOfStars.size() > 0){ // If any stars available nearby steer randomly towards one of them
                                                steerRandomChoice = randGenerator.nextInt(indexOfStars.size());
                                                directionIndex = indexOfStars.get(steerRandomChoice);
                                                trackActionQuantum = Direction.values()[directionIndex].name();
                                            } else if (indexOfEmpty.size() > 0) { // Else if any empty square available nearby steer randomly towards one of them
                                                steerRandomChoice = randGenerator.nextInt(indexOfEmpty.size());
                                                directionIndex = indexOfEmpty.get(steerRandomChoice);
                                            } else{
                                                steerRandomChoice = randGenerator.nextInt(8);
                                                directionIndex = steerRandomChoice;
                                            }
                                            trackActionQuantum = Direction.values()[directionIndex].name();

                                        } else if (moveHistory.get(moveHistory.size() - 1).equals(Constants.SCAN)) { //Steer just after scan
                                            trackAction = Constants.SCAN;
                                            trackActionQuantum = Direction.values()[getDirectionIndex()].name();
                                        } else {
                                            trackAction = scan;
                                            trackAction = Constants.SCAN;
                                            trackActionQuantum = "";
                                        }

                                    }

                                   */