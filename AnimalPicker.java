import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which animal would you like to see? Your options are cat, dog, fish, sonic, or Link. ");
        String word;
        do {
            word = keyboard.nextLine();
            if (word.equalsIgnoreCase("cat")) {
                System.out.println(" _._     _,-'\"\"`-._\r\n" + //
                                        "(,-.`._,'(       |\\`-/|\r\n" + //
                                        "    `-.-' \\ )-`( , o o)\r\n" + //
                                        "          `-    \\`_`\"'-");
            } else if (word.equalsIgnoreCase("dog")) {
                System.out.println("            __\r\n" + //
                                        "(\\,--------'()'--o\r\n" + //
                                        " (_    ___    /~\"\r\n" + //
                                        "  (_)_)  (_)_)");
            } else if (word.equalsIgnoreCase("fish")) {
                System.out.println("          /\"*._         _\r\n" + //
                                        "      .-*'`    `*-.._.-'/\r\n" + //
                                        "    < * ))     ,       ( \r\n" + //
                                        "      `*-._`._(__.--*\"`.\\");
            } else if (word.equalsIgnoreCase("sonic")){
                System.out.println("                             ...,?77??!~~~~!???77?<~.... \n                        ..?7`                           `7!.. \n                    .,=`          ..~7^`   I                  ?1. \n       ........  ..^            ?`  ..?7!1 .               ...??7 \n      .        .7`        .,777.. .I.    . .!          .,7! \n      ..     .?         .^      .l   ?i. . .`       .,^ \n       b    .!        .= .?7???7~.     .>r .      .= \n       .,.?4         , .^         1        `     4... \n        J   ^         ,            5       `         ?<. \n       .%.7;         .`     .,     .;                   .=. \n       .+^ .,       .%      MML     F       .,             ?, \n        P   ,,      J      .MMN     F        6               4. \n        l    d,    ,       .MMM!   .t        ..               ,, \n        ,    JMa..`         MMM`   .         .!                .; \n         r   .M#            .M#   .%  .      .~                 ., \n       dMMMNJ..!                 .P7!  .>    .         .         ,, \n       .WMMMMMm  ?^..       ..,?! ..    ..   ,  Z7`        `?^..  ,, \n          ?THB3       ?77?!        .Yr  .   .!   ?,              ?^C \n            ?,                   .,^.` .%  .^      5. \n              7,          .....?7     .^  ,`        ?. \n                `<.                 .= .`\'           1 \n                ....dn... ... ...,7..J=!7,           ., \n             ..=     G.,7  ..,o..  .?    J.           F \n           .J.  .^ ,,,t  ,^        ?^.  .^  `?~.      F \n          r %J. $    5r J             ,r.1      .=.  .% \n          r .77=?4.    ``,     l ., 1  .. <.       4., \n          .$..    .X..   .n..  ., J. r .`  J.       `\' \n        .?`  .5        `` .%   .% .\' L.\'    t \n        ,. ..1JL          .,   J .$.?`      . \n                1.          .=` ` .J7??7<.. .; \n                 JS..    ..^      L        7.: \n                   `> ..       J.  4. \n                    +   r `t   r ~=..G. \n                    =   $  ,.  J \n                    2   r   t  .; \n              .,7!  r   t`7~..  j.. \n              j   7~L...$=.?7r   r ;?1. \n               8.      .=    j ..,^   .. \n              r        G              . \n            .,7,        j,           .>=. \n         .J??,  `T....... %             .. \n      ..^     <.  ~.    ,.             .D \n    .?`        1   L     .7.........?Ti..l \n   ,`           L  .    .%    .`!       `j, \n .^             .  ..   .`   .^  .?7!?7+. 1 \n.`              .  .`..`7.  .^  ,`      .i.; \n.7<..........~<<3?7!`    4. r  `          G% \n                          J.` .!           % \n                            JiJ           .` \n                              .1.         J \n                                 ?1.     .\'         \n                                     7<..%");
            } else if (word.equalsIgnoreCase("link")) {
                System.out.println("              _______\n" +
                                        "         ..-\'`       ````---.\n" +
                                        "       .\'          ___ .\'````.\'SS\'.\n" +
                                        "      /        ..-SS####\'.  /SSHH##\'.\n" +
                                        "     |       .\'SSSHHHH##|/#/#HH#H####\'.\n" +
                                        "    /      .\'SSHHHHH####/||#/: \\SHH#####\\\n" + 
                                        "   /      /SSHHHHH#####/!||;`___|SSHH###\\\n" +
                                        "-..__    /SSSHHH######.         \\SSSHH###\\\n" +
                                        "`.\'-.\'\'--._SHHH#####.\'           \'.SH####/\n" +
                                        "  \'. ``\'-  \'/SH####`/_             `|H##/\n" +
                                        "  | \'.     /SSHH###|`\'==.       .==\'/\\H|\n" +
                                        "  |   `\'-.|SHHHH##/\\__\\/        /\\//|~|/\n" +
                                        "  |    |S#|/HHH##/             |``  |\n" + 
                                        "  |    \\H\' |H#.\'`              \\    |\n" +
                                        "  |        \'\'`|               -     /\n" + 
                                        "  |          /H\\          .----    /\n" + 
                                        "  |         |H#/\'.           `    /\n" +
                                        "  |          \\| | \'..            /\n" +
                                        "  |    ^~DLF   /|    \'\'..______.\'\n" +
                                        "   \\          //\\__    _..-. | \n" +
                                        "    \\         ||   ````     \\ |_\n" +
                                        "     \\    _.-|               \\| |_\n" +
                                        "     _\\_.-\'   `\'\'\'\'\'-.        |   `--.\n" +
                                        " \'\'``    \\            `\'\'-;    \\ /\n" +
                                        "          \\      .-\'|     ````.\' -\n" +
                                        "          |    .\'  `--\'\'\'\'\'-.. |/\n" +
                                        "          |  .\'               \\|\n" +
                                        "          |.\'");
            } else {
                // error message
                System.out.print("Invalid animal. ");
            }
        } while (!word.equalsIgnoreCase("cat") && !word.equalsIgnoreCase("dog") && !word.equalsIgnoreCase("fish") && !word.equalsIgnoreCase("sonic") && !word.equalsIgnoreCase("link"));
        keyboard.close();
    }
}