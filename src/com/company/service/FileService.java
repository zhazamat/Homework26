package com.company.service;

    import com.company.entitiy.Fargo;
    import com.company.entitiy.Film;
    import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

    import java.io.IOException;
    import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

    public class FileService {
        private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        private static final Path film = Paths.get("film.json");

        public static Film[] readFile() {
            String json = "";
            try {
                json = Files.readString(film);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return GSON.fromJson(json, Fargo[].class);
        }

        public static void writeFile(Film[] films) {
            String json = GSON.toJson(films);
            try {
                byte[] arr = json.getBytes();
                Files.write(film, arr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
