package org.example.moodanalyserexception;

public class MoodAnalysisException extends Exception {
    private final MoodAnalyser.MoodAnalysisError error;
    public MoodAnalysisException(MoodAnalyser.MoodAnalysisError error) {
        super(error.getErrorMessage());
        this.error = error;
    }

    public MoodAnalyser.MoodAnalysisError getError() {
        return error;
    }
}
