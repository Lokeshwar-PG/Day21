package org.example.moodanalyserexception;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser() {
        this.message = "";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    enum MoodAnalysisError { EMPTY_MOOD("Mood should not be empty"), NULL_MOOD("Mood should not be null");
        private final String errorMessage;
        MoodAnalysisError(String error) { this.errorMessage = error; }
        public String getErrorMessage() { return errorMessage; }
                           }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if(message==null) {
                throw new MoodAnalysisException(MoodAnalysisError.NULL_MOOD);
            }
            if(message.isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD);
            }
            if(message.contains("sad")) {
                return "SAD";
            }
            return "HAPPY";
        } catch (Exception e) {
            throw e;
        }

    }
}
