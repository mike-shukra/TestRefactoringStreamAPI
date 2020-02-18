import data.Member;
import data.MembersGroup;
import service.Finder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainTest {

    private static Finder finder = new Finder();
    private static List<MembersGroup> groups = new ArrayList<>();
    private static Set<String> mySet = new HashSet<>();

    public static void main(String[] args) {
        groups.add(new MembersGroup("group00", createMembers(10)));
        groups.add(new MembersGroup("group01", createMembers(20)));
        groups.add(new MembersGroup("group02", createMembers(30)));
        groups.add(new MembersGroup("group03", createMembers(40)));
        mySet = finder.findOldMembers(groups, 35);

        System.out.println("test: ");
        for (String group: mySet) {
            System.out.println(group);
        }
    }

    private static List<Member> createMembers(int age){

        List<Member> members = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String name = ("name " + i + " age: " + age);
            members.add(new Member(name, age));
        }
        return members;
    }

}
