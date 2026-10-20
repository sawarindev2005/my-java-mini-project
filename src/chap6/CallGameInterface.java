package chap6;

public class CallGameInterface {
    public static void main(String[] args) {
        new Game() {
            @Override
            public void start() {
                System.out.println("Anonimous : start");
            }

            @Override
            public void pause() {
                System.out.println("Anonimous : pause");
            }

            @Override
            public void toContinue() {
                System.out.println("Anonimous : toContinue");
            }

            @Override
            public void stop() {
                System.out.println("Anonimous : stop");
            }

            @Override
            public void play() {
                System.out.println("Anonimous : play");
            }
        };
        
        new TicTacToeAbst() {
            @Override
            public void toContinue() {
                System.out.println("Anonimous : toContinue");
            }

            @Override
            public void stop() {
                System.out.println("Anonimous : stop");
            }
            
        };//end TicTacToeAbst
        TicTacToe tt = new TicTacToe();
        tt.start(); tt.pause(); tt.play(); tt.toContinue(); tt.stop();
    }//end main
}//end
