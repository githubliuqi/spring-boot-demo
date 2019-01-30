package com.example.demo.sweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class IndexController {

    @GetMapping("/say")
    public String  index(){
        return "Hello Spring Boot";
    }
    @GetMapping("/signurl")
    public String getSignUrl()
    {
        String string=   "cn.com.icbc.mw.phone://req?MessageType=0&Version=1.0.1&ICBC_SessionID=9ACB0D20A9D95182677089D120B46F706FEE224C&ICBC_Random=0123456789012345678901234567890123456789&ICBC_APPVersion=1.0.1&U_Language=zh_CN&U_Charset=GBK&U_SerialNumber=6900000115&U_CertCN=LztbyBB1aSw=&Sign_WarningInfo=yPTQxc+isrvSu9bCo6zH67C0Vbbcyc+1xChDvPwp1tXWub270tehow==&Sign_PlainText=&Sign_XMLInfo=USnnZclIL8dEzHOB+dMY4TzSYJL+P0rgZIwzkHvkj6ZUGcRBEneBaPhT/4Nn4RyJ6aedvTmpuiSy6lNK1Ocqv6KODsGs3Z98QPhYcefk7JRk9oIhYYm6Yi+wXbVoXF2+dUj4jp2+od/7mOHj4yL5W/lgvZZ1KmV8HfLIEe3MTKyFjrMMXIMScPp0g5gqlbr3zmw+oouuF9Mwy+sECDwatR9iqHpViygNl1AUuskh+aZH2UFDArlo28Q8YYzmy62Yy6qElY5fSH/Drf3x3xiuW8salrgSkQX0H4XcWmXiLwkrdjK3d2Tqon2UN3qIPu5UHl49yNZdhfXOFc5FnuMoOTa8yqW/P4tfq9JTdfI9dv8PO3evXOm0rrahshOy3b/GGp2UY/DSV+y3UYyyWVGv3LhyUu+Y1asIFUJNRNCiL9wrRnzpDjNM7RCWzTxaSXWaWAh/pXvHYbnKn9OFud32r5N210OkF1BE7OpBjFrD3oq80PYiLYpWqyTZe8kWpzoKzhzQBI6s/hyAVxCIxK3pfo+4vFwfRhIOepSD3CkuzFBZj5jQFgVm/9yJDawKa0oyLXTjMHRqEgWcFPsIgDDX9VHx7baQyDJX72+M4mTs0JIOUfym95nqxlASNS9wSceb&Sign_KeyInfo=SSEegxI6iacXLgFipHaoJz1s3aI6jv6F1bVA0eCUFJ264ve80i0NPWuKv5ZIe6UHqEl1Z2S/n0k1N93i1XWrvkeFm+5+6dB4pGeEtaUcjLy1A5J00qR3TRwQzD4N4sl3CMJqN5qf+PKbf2NW8NjtWR7Gtk6DQ6JxNGMUIRi6vih1qpG4PvMBVeBvmo3pm2H9CU3e6/VgUZyAvxfIfdm6w394iJSl+IpFfuYXyopK7JHcLUUtw4zL0LG8ta4z7qFNx7fDP40hQq7U/717434WBAGN6UZqbsQz&Sign_FileInfo=&HashAlg=&U_KeyType=02&ICBC_APPURLName=cn.com.icbc.mw.phone";
        string =         "cn.com.icbc.mw.phone://req?MessageType=1&Version=1.0.0&ICBC_SessionID=9ACB0D20A9D95182677089D120B46F706FEE224C&ICBC_Random=0123456789012345678901234567890123456789&ICBC_APPVersion=1.0.0&U_Language=zh_CN&U_Charset=GBK&U_SerialNumber=6900000115&U_CertCN=LztbyBB1aSw=&Sign_WarningInfo=yPTQxc+isrvSu9bCo6zH67C0Vbbcyc+1xChDvPwp1tXWub270tehow==&Sign_PlainText=xiFHYVK17koWZLghLjt/T1/gyhm2shg1nfNBFuuf41Ln3RhWsAQQTdMPPM06dK3HXiJx462Q2UKE3MD0UJu8VgNtoKS3r9K4+MdLI9ChrzaSzSbYvflLP0Cu4PDv0fdETm16dJ0RFwjuhvlsFiYn/0xPfhWJs5Bov7Hf8Qt758qAuhZKlb9reT2YGpuDljbS9jrP74Li6w29UWAmmj7p/vSFWOB9KBzjrQA9mf5GnMe7iiOryZWqgmfPO7XPVWKmCdjQgfO6FgKP7ErV4m/guLFVWkdRSIJRjy2a9JVpeQ7xh+Z/fXWsjUS/0hBsdwnslwL2BU0uRk4b6DakfHUlzAgui+a7pnagaURf/d+RKx4cr+7w5+V13nPIOGsNa3qNndnZV5GyzD54sxjn3pZPappN8oRb4NplxPbDq+mG1OnAoWPm2iRz6TazGDvwSf93LCQXhE+NaKJKHEkfD2NwDYj8dr44dq/EnhVjUyuVrjsGICqlYW49NEEd22HH+/gscAAP3d5e8JaJz0SZ2h38cosnVWnbKF3ysLmhicy81fGs8nPeUvn8wbgeMPPC8BAd/WuWRbmC59866UnvQMr/UQtSJC63yRxXjoVm4ogi6W0qVAYxOY/r5u9XgeoDFDzQre4PyeK7+ZBLsR1yzNujS9nRYyPRt+y+L2aCayUL8kroId7/eNTtL3niSrhXlaOFX1W961N9A9zHJmO1TQNpSflo8F+/MRG+EqplC0rpLFI2t2woZR1OjiElX6WJ+na7ZckNMZjTr3/bkwXcGhLGKK63EoCDapNBfNxOv2cRuohnq/lMKMBg7GQQ3uk4j04t5gB+oxKmMxgJSmhmKCEuuUW+eJ/j0lOuPsrzhYXCR+OfchUGIGLO7Z5T9aqVbTY7vky7ui+0PgNhKuJe9QTe8cGtWAnC2p/XiUxO/JCWhwt5tFst4SKYbmoF7NGbrVn4olqcERWxrmRW1EzybUS7e9G4KC866b8JUQVzorMJKI66bsQEJXBDGCPzNDq+5OOQFBrQtKZdwWP+USj11lFzQuq98y811mrJ/uQG8Lkf+CNm9COUG1vi2LtkNI6LxbQVsussG6PkFz3sw1MBpjkIVTtpdFj07G7O&Sign_XMLInfo=&Sign_KeyInfo=&HashAlg=SHA1&U_KeyType=2&ICBC_APPURLName=cn.com.icbc.mw.phone";
        //string =       "cn.com.icbc.mw.phone://req?MessageType=1&  =1.0.0&ICBC_SessionID=9ACB0D20A9D95182677089D120B46F706FEE224C&ICBC_Random=0123456789012345678901234567890123456789&ICBC_APPVersion=1.0.0&U_Language=zh_CN&U_Charset=GBK&U_SerialNumber=6900000115&U_CertCN=LztbyBB1aSw=&Sign_WarningInfo=aGVsbG8=&Sign_PlainText=xiFHYVK17koWZLghLjt/T1/gyhm2shg1nfNBFuuf41Ln3RhWsAQQTdMPPM06dK3HXiJx462Q2UKE3MD0UJu8VgNtoKS3r9K4+MdLI9ChrzaSzSbYvflLP0Cu4PDv0fdETm16dJ0RFwjuhvlsFiYn/0xPfhWJs5Bov7Hf8Qt758qAuhZKlb9reT2YGpuDljbS9jrP74Li6w29UWAmmj7p/vSFWOB9KBzjrQA9mf5GnMe7iiOryZWqgmfPO7XPVWKmCdjQgfO6FgKP7ErV4m/guLFVWkdRSIJRjy2a9JVpeQ7xh+Z/fXWsjUS/0hBsdwnslwL2BU0uRk4b6DakfHUlzAgui+a7pnagaURf/d+RKx4cr+7w5+V13nPIOGsNa3qNndnZV5GyzD54sxjn3pZPappN8oRb4NplxPbDq+mG1OnAoWPm2iRz6TazGDvwSf93LCQXhE+NaKJKHEkfD2NwDYj8dr44dq/EnhVjUyuVrjsGICqlYW49NEEd22HH+/gscAAP3d5e8JaJz0SZ2h38cosnVWnbKF3ysLmhicy81fGs8nPeUvn8wbgeMPPC8BAd/WuWRbmC59866UnvQMr/UQtSJC63yRxXjoVm4ogi6W0qVAYxOY/r5u9XgeoDFDzQre4PyeK7+ZBLsR1yzNujS9nRYyPRt+y+L2aCayUL8kroId7/eNTtL3niSrhXlaOFX1W961N9A9zHJmO1TQNpSflo8F+/MRG+EqplC0rpLFI2t2woZR1OjiElX6WJ+na7ZckNMZjTr3/bkwXcGhLGKK63EoCDapNBfNxOv2cRuohnq/lMKMBg7GQQ3uk4j04t5gB+oxKmMxgJSmhmKCEuuUW+eJ/j0lOuPsrzhYXCR+OfchUGIGLO7Z5T9aqVbTY7vky7ui+0PgNhKuJe9QTe8cGtWAnC2p/XiUxO/JCWhwt5tFst4SKYbmoF7NGbrVn4olqcERWxrmRW1EzybUS7e9G4KC866b8JUQVzorMJKI66bsQEJXBDGCPzNDq+5OOQFBrQtKZdwWP+USj11lFzQuq98y811mrJ/uQG8Lkf+CNm9COUG1vi2LtkNI6LxbQVsussG6PkFz3sw1MBpjkIVTtpdFj07G7O&Sign_XMLInfo=&Sign_KeyInfo=&HashAlg=SHA1&U_KeyType=2&ICBC_APPURLName=cn.com.icbc.mw.phone";
        string = "cn.com.icbc.mw.phone://req?MessageType=1&Version=1.0.0&ICBC_SessionID=9ACB0D20A9D95182677089D120B46F706FEE224C&ICBC_Random=0123456789012345678901234567890123456789&ICBC_APPVersion=1.0.0&U_Language=zh_CN&U_Charset=GBK&U_SerialNumber=6900000115&U_CertCN=LztbyBB1aSw=&Sign_WarningInfo=yPTQxc+isrvSu9bCo6zH67C0Vbbcyc+1xChDvPwp1tXWub270tehow==&Sign_PlainText=&Sign_XMLInfo=USnnZclIL8dEzHOB+dMY4TzSYJL+P0rg01Tor/fLPkow6uFR6TqgZrv8GiAViF0PKCqWX8oIBy7LtXc0QqYqa0KU/ifTzE49MljMDstdZ1WCsIHNYFDWF8aw+sg3ifDoFL2RE3SxKGLXm9v9DyHawA6ytmigRz2sej1X+Z/eWrBlSmFogoU8nrqwQo/YHAQS6Pas4c0MJ77iMYczOcgEfqxbhB+0BAmp1oxJYZy/jtyW2G158Z8GowyeCMNZZsiX6ns6HFMs5iSSj51LOEy0hH1Wr0LV1naka6ja/WIyf1hR7+rYbIZ0xV6K8PeZazzpbN+awSY0Mv7IVq432QDBpcHFTCFUC2j3ntERrL4IRQJ2CZET1mmvzeXmc/wGtCSrvdnG+TmimOloWv2taPWJwUE3ZgOuvaEE31soJTkATyylv6H+tMDrmoR6Une5evjunjIbgM1Qna5KyLdjdVHrI0j+ZXZHi/r6X7VGDocHHV3MAZAXkbq4kiZUpdRGk5mOsi36FSBoP6kXsCyjAokbx+FKk1I3gCdfjIGJS1yD20DBiN0X8CRyBx9ORGApWxaREwbT2EMZ48ta4zrAKnlzbaYtFPLdZRA4p2ASyocYBeaP1/2QV0YpwP0EhbzDmdESpHbY1ld+JkKCoCz2mUdtylvwaFmtgNLbzl/V+G33mT589SqvYOk6BNWFdPqV15x6w1HyVyu7w5HMeEVuzsA0Yh3brvZk+eIbArEgZAeIFgz7S5ZyyWIDHh94q2wsxe8wBds9bwzejbxvnbhcyfYsyMmc2K8Khfjd&Sign_KeyInfo=SSEegxI6iafc9RGM0l1B5XUvvkKtzZCzE8YVaofqnPemFqKinS4rFWpNK+O57A9lAeJUvMljWWOYFa3cQ+Nlqr5b5cE707mtDB727TaPx3sGJzc/HjmjBgyXta7RSMZGQgq3vA5gXXQmTpz2eFBBr4+Zqj9kJCtbSzLM/pPkHGf8XEmA5pXeinL1423OzdVSP5NM+6FmSCutiooJqK42dx5jDFo0WUGQkEc53l4E0sM8gOZW2BRtwMRoU48w4quAXf9DvzUDWgJvftnP4wAP5g==&HashAlg=SHA1&U_KeyType=2&ICBC_APPURLName=cn.com.icbc.mw.phone";
        return string;
    }

    @GetMapping("certurl1")
    public String getRequestCertUrl1()
    {
       String certUrl1 = "cn.com.icbc.mw.phone://req?MessageType=3&Version=1.0.0.1&ICBC_SessionID=FFCB020B25B7AC899AE01B71CAE77254BEDE272F&ICBC_Random=4268764762055248965313053919537629202740&ICBC_APPVersion=1.0.0.1&U_SerialNumber=6900000115&U_Language=zh_CN&U_Charset=GBK&U_CertParam=DN(CN=liuqi)HASH()KEYTYPE(RSA1024)CERTTYPE(01)&Cert_PKCS7Info=&U_KeyType=02&ICBC_APPURLName=cn.com.icbc.mw.phone";
       //String certUrl2 = "cn.com.icbc.mw.phone://req?MessageType=4&Version=1.0.0.1&ICBC_SessionID=FFCB020B25B7AC899AE01B71CAE77254BEDE272F&ICBC_Random=4268764762055248965313053919537629202740&ICBC_APPVersion=1.0.0.1&U_SerialNumber=6900000115&U_Language=zh_CN&U_Charset=GBK&U_CertParam=&Cert_PKCS7Info=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&U_KeyType=02&ICBC_APPURLName=cn.com.icbc.mw.phone";
        // certUrl1 =       "cn.com.icbc.mw.phone://req?MessageType=3&Version=1.0.0.1&ICBC_SessionID=FFCB020B25B7AC899AE01B71CAE77254BEDE272F&ICBC_Random=4268764762055248965313053919537629202740&ICBC_APPVersion=1.0.0.1&U_SerialNumber=6900000115&U_Language=zh_CN&U_Charset=GBK&U_CertParam=DN(CN=liuqi)HASH()KEYTYPE(RSA1024)CERTTYPE(01)&Cert_PKCS7Info=&U_KeyType=02&ICBC_APPURLName=cn.com.icbc.mw.phone";
       return certUrl1;
    }
    @GetMapping("certurl2")
    public String getRequestCertUrl2()
    {
        //String certUrl1 = "cn.com.icbc.mw.phone://req?MessageType=3&Version=1.0.0.1&ICBC_SessionID=FFCB020B25B7AC899AE01B71CAE77254BEDE272F&ICBC_Random=4268764762055248965313053919537629202740&ICBC_APPVersion=1.0.0.1&U_SerialNumber=6900000115&U_Language=zh_CN&U_Charset=GBK&U_CertParam=DN(CN=liuqi)HASH()KEYTYPE(RSA1024)CERTTYPE(01)&Cert_PKCS7Info=&U_KeyType=02&ICBC_APPURLName=cn.com.icbc.mw.phone";
        String certUrl2 = "cn.com.icbc.mw.phone://req?MessageType=4&Version=1.0.0.1&ICBC_SessionID=FFCB020B25B7AC899AE01B71CAE77254BEDE272F&ICBC_Random=4268764762055248965313053919537629202740&ICBC_APPVersion=1.0.0.1&U_SerialNumber=6900000115&U_Language=zh_CN&U_Charset=GBK&U_CertParam=&Cert_PKCS7Info=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&U_KeyType=02&ICBC_APPURLName=cn.com.icbc.mw.phone";
        //certUrl2 = "cn.com.icbc.mw.phone://req?MessageType=4&Version=1.0.0.1&ICBC_SessionID=FFCB020B25B7AC899AE01B71CAE77254BEDE272F&ICBC_Random=4268764762055248965313053919537629202740&ICBC_APPVersion=1.0.0.1&U_SerialNumber=6900000115&U_Language=zh_CN&U_Charset=GBK&U_CertParam=&Cert_PKCS7Info=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&U_KeyType=02&ICBC_APPURLName=cn.com.icbc.mw.phone";
        return certUrl2;
    }
}