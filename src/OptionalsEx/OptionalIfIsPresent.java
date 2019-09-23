package OptionalsEx;

import java.util.Optional;

public class OptionalIfIsPresent {
    public static void main(String[] args) {
        Optional<String> optionalStr = Optional.ofNullable("Hello Optional!");
        if(optionalStr.isPresent()){// optionalStr.isPresent() returns True or False
            System.out.println(optionalStr.get());
        }
        optionalStr.ifPresent(str-> System.out.println());  //ifPresent(Consumer)
    }
}
