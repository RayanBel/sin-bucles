public class ScreenLock {
        boolean isUsed[][] = new boolean[][] { { false, false, false },
                        { false, false, false },
                        { false, false, false } };

        public int calculateCombinations(char startPosition, int patternLength) {
                if (patternLength < 1 || patternLength > 9)
                        return 0;
                if (patternLength == 1)
                        return 1;
                        
                int length = 0;
                switch (startPosition) {
                        case 'A':
                                isUsed[0][0] = true;
                                if (!isUsed[0][1])
                                        length += calculateCombinations('B', patternLength - 1);
                                else if (!isUsed[0][2])
                                        length += calculateCombinations('C', patternLength - 1);
                                if (!isUsed[1][0])
                                        length += calculateCombinations('D', patternLength - 1);
                                else if (!isUsed[2][0])
                                        length += calculateCombinations('G', patternLength - 1);
                                if (!isUsed[1][1])
                                        length += calculateCombinations('E', patternLength - 1);
                                else if (!isUsed[2][2])
                                        length += calculateCombinations('I', patternLength - 1);
                                if (!isUsed[1][2])
                                        length += calculateCombinations('F', patternLength - 1);
                                if (!isUsed[2][1])
                                        length += calculateCombinations('H', patternLength - 1);
                                isUsed[0][0] = false;
                                break;
                        case 'B':
                                isUsed[0][1] = true;
                                if (!isUsed[0][0])
                                        length += calculateCombinations('A', patternLength - 1);
                                if (!isUsed[0][2])
                                        length += calculateCombinations('C', patternLength - 1);
                                if (!isUsed[1][0])
                                        length += calculateCombinations('D', patternLength - 1);
                                if (!isUsed[1][1])
                                        length += calculateCombinations('E', patternLength - 1);
                                else if (!isUsed[2][1])
                                        length += calculateCombinations('H', patternLength - 1);
                                if (!isUsed[1][2])
                                        length += calculateCombinations('F', patternLength - 1);
                                if (!isUsed[2][0])
                                        length += calculateCombinations('G', patternLength - 1);
                                if (!isUsed[2][2])
                                        length += calculateCombinations('I', patternLength - 1);
                                isUsed[0][1] = false;
                                break;
                        case 'C':
                                isUsed[0][2] = true;
                                if (!isUsed[0][1])
                                        length += calculateCombinations('B', patternLength - 1);
                                else if (!isUsed[0][0])
                                        length += calculateCombinations('A', patternLength - 1);
                                if (!isUsed[1][1])
                                        length += calculateCombinations('E', patternLength - 1);
                                else if (!isUsed[2][0])
                                        length += calculateCombinations('G', patternLength - 1);
                                if (!isUsed[1][0])
                                        length += calculateCombinations('D', patternLength - 1);
                                if (!isUsed[1][2])
                                        length += calculateCombinations('F', patternLength - 1);
                                else if (!isUsed[2][2])
                                        length += calculateCombinations('I', patternLength - 1);
                                if (!isUsed[2][1])
                                        length += calculateCombinations('H', patternLength - 1);
                                isUsed[0][2] = false;
                                break;
                        case 'D':
                                isUsed[1][0] = true;
                                if (!isUsed[0][0])
                                        length += calculateCombinations('A', patternLength - 1);
                                if (!isUsed[0][1])
                                        length += calculateCombinations('B', patternLength - 1);
                                if (!isUsed[0][2])
                                        length += calculateCombinations('C', patternLength - 1);
                                if (!isUsed[1][1])
                                        length += calculateCombinations('E', patternLength - 1);
                                else if (!isUsed[1][2])
                                        length += calculateCombinations('F', patternLength - 1);
                                if (!isUsed[2][0])
                                        length += calculateCombinations('G', patternLength - 1);
                                if (!isUsed[2][1])
                                        length += calculateCombinations('H', patternLength - 1);
                                if (!isUsed[2][2])
                                        length += calculateCombinations('I', patternLength - 1);
                                isUsed[1][0] = false;
                                break;
                        case 'E':
                                isUsed[1][1] = true;
                                if (!isUsed[0][0])
                                        length += calculateCombinations('A', patternLength - 1);
                                if (!isUsed[0][1])
                                        length += calculateCombinations('B', patternLength - 1);
                                if (!isUsed[0][2])
                                        length += calculateCombinations('C', patternLength - 1);
                                if (!isUsed[1][0])
                                        length += calculateCombinations('D', patternLength - 1);
                                if (!isUsed[1][2])
                                        length += calculateCombinations('F', patternLength - 1);
                                if (!isUsed[2][0])
                                        length += calculateCombinations('G', patternLength - 1);
                                if (!isUsed[2][1])
                                        length += calculateCombinations('H', patternLength - 1);
                                if (!isUsed[2][2])
                                        length += calculateCombinations('I', patternLength - 1);
                                isUsed[1][1] = false;
                                break;
                        case 'F':
                                isUsed[1][2] = true;
                                if (!isUsed[0][0])
                                        length += calculateCombinations('A', patternLength - 1);
                                if (!isUsed[0][1])
                                        length += calculateCombinations('B', patternLength - 1);
                                if (!isUsed[0][2])
                                        length += calculateCombinations('C', patternLength - 1);
                                if (!isUsed[1][1])
                                        length += calculateCombinations('E', patternLength - 1);
                                else if (!isUsed[1][0])
                                        length += calculateCombinations('D', patternLength - 1);
                                if (!isUsed[2][0])
                                        length += calculateCombinations('G', patternLength - 1);
                                if (!isUsed[2][1])
                                        length += calculateCombinations('H', patternLength - 1);
                                if (!isUsed[2][2])
                                        length += calculateCombinations('I', patternLength - 1);
                                isUsed[1][2] = false;
                                break;
                        case 'G':
                                isUsed[2][0] = true;
                                if (!isUsed[0][1])
                                        length += calculateCombinations('B', patternLength - 1);
                                if (!isUsed[1][1])
                                        length += calculateCombinations('E', patternLength - 1);
                                else if (!isUsed[0][2])
                                        length += calculateCombinations('C', patternLength - 1);
                                if (!isUsed[1][0])
                                        length += calculateCombinations('D', patternLength - 1);
                                else if (!isUsed[0][0])
                                        length += calculateCombinations('A', patternLength - 1);
                                if (!isUsed[1][2])
                                        length += calculateCombinations('F', patternLength - 1);
                                if (!isUsed[2][1])
                                        length += calculateCombinations('H', patternLength - 1);
                                else if (!isUsed[2][2])
                                        length += calculateCombinations('I', patternLength - 1);
                                isUsed[2][0] = false;
                                break;
                        case 'H':
                                isUsed[2][1] = true;
                                if (!isUsed[0][0])
                                        length += calculateCombinations('A', patternLength - 1);
                                if (!isUsed[0][2])
                                        length += calculateCombinations('C', patternLength - 1);
                                if (!isUsed[1][0])
                                        length += calculateCombinations('D', patternLength - 1);
                                if (!isUsed[1][1])
                                        length += calculateCombinations('E', patternLength - 1);
                                else if (!isUsed[0][1])
                                        length += calculateCombinations('B', patternLength - 1);
                                if (!isUsed[1][2])
                                        length += calculateCombinations('F', patternLength - 1);
                                if (!isUsed[2][0])
                                        length += calculateCombinations('G', patternLength - 1);
                                if (!isUsed[2][2])
                                        length += calculateCombinations('I', patternLength - 1);
                                isUsed[2][1] = false;
                                break;
                        case 'I':
                                isUsed[2][2] = true;
                                if (!isUsed[0][1])
                                        length += calculateCombinations('B', patternLength - 1);
                                if (!isUsed[1][1])
                                        length += calculateCombinations('E', patternLength - 1);
                                else if (!isUsed[0][0])
                                        length += calculateCombinations('A', patternLength - 1);
                                if (!isUsed[2][1])
                                        length += calculateCombinations('H', patternLength - 1);
                                else if (!isUsed[2][0])
                                        length += calculateCombinations('G', patternLength - 1);
                                if (!isUsed[1][0])
                                        length += calculateCombinations('D', patternLength - 1);
                                if (!isUsed[1][2])
                                        length += calculateCombinations('F', patternLength - 1);
                                else if (!isUsed[0][2])
                                        length += calculateCombinations('C', patternLength - 1);
                                isUsed[2][2] = false;
                                break;
                }
                return length;
        }
}
