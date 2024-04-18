package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * 메모리 기반 스트림
 * - 주로 다른 곳에 입출력하기 전에 데이터를 임시로 바이트 배열에 담아서 변환 등의 작업을 하는데 사용
 * - 바이트배열은 사용하는 자원이 메모리 밖에 없으므로 가비지컬렉터에 의해 자동적으로 자원을 반환하므로 스트림 close() 불필요
 * ByteArrayInputStream
 * ByteArrayOutputStream
 */
public class Ex15_1 {

    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        int data = 0;
        while ((data = input.read()) != -1)
            output.write(data);

        outSrc = output.toByteArray(); // 스트림의 내용을 byte 배열로 반환

        System.out.println("Input Source: " + Arrays.toString(inSrc));
        System.out.println("Output Source: " + Arrays.toString(outSrc));

    }





}
