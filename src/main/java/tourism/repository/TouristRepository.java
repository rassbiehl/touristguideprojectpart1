package tourism.repository;

import org.springframework.stereotype.Repository;
import tourism.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TouristRepository {
    private List<TouristAttraction> attractions;

    public TouristRepository() {
        attractions = new ArrayList<>();

        attractions.add(new TouristAttraction("Rundetaarn",
                "Rundetaarn er et 41.55 meter højt tårn i hjertet af København. " +
                        "Det blev bygget i 1642 som en del af Trinitatis-komplekset. " +
                        "Tårnet er kendt for sin unikke sneglegang, der snor sig opad. " +
                        "Fra toppen har man en fantastisk udsigt over byens tage."));

        attractions.add(new TouristAttraction("Den Lille Havfrue",
                "Den Lille Havfrue er en berømt statue beliggende ved Langelinie. " +
                        "Statue blev opført i 1913 og er inspireret af H.C. Andersens eventyr. " +
                        "Den symboliserer en tragisk kærlighedshistorie mellem havfruen og prinsen. " +
                        "Hvert år besøges den af millioner af turister fra hele verden."));

        attractions.add(new TouristAttraction("Tivoli",
                "Tivoli er verdens næstældste forlystelsespark, åbnet i 1843. " +
                        "Parken ligger midt i København og har både rutsjebaner og koncerter. " +
                        "Tivoli er kendt for sin magiske stemning, især ved juletid. " +
                        "Haven er også en inspirationskilde til Walt Disneys Disneyland."));

        attractions.add(new TouristAttraction("Nyhavn",
                "Nyhavn er en af Københavns mest ikoniske seværdigheder. " +
                        "Det er kendt for sine farverige havnehuse, restauranter og barer. " +
                        "Om sommeren summer området af liv med folk ved kajen. " +
                        "Nyhavn var engang et område for sømænd, men er nu en turistmagnet."));

        attractions.add(new TouristAttraction("Kronborg Slot",
                "Kronborg Slot er en historisk fæstning i Helsingør. " +
                        "Slottet er kendt fra Shakespeares Hamlet og har stor kulturel betydning. " +
                        "Det har fungeret som kongebolig, fæstning og militærbase. " +
                        "Besøgende kan opleve de smukke sale og de underjordiske gange."));

        attractions.add(new TouristAttraction("Legoland Billund",
                "Legoland Billund er en familievenlig temapark i Danmark. " +
                        "Parken er bygget op omkring LEGO-klodser og byder på sjove attraktioner. " +
                        "Besøgende kan udforske miniaturer af verdenskendte bygninger. " +
                        "Der er også rutsjebaner, vandattraktioner og interaktive oplevelser."));

        attractions.add(new TouristAttraction("Aarhus Domkirke",
                "Aarhus Domkirke er Danmarks længste og højeste kirke. " +
                        "Den stammer fra 1200-tallet og har en rig middelalderhistorie. " +
                        "Kirkens imponerende indre rummer smukke kalkmalerier og en stor altertavle. " +
                        "Domkirken er stadig et aktivt religiøst samlingspunkt i Aarhus."));

        attractions.add(new TouristAttraction("Møns Klint",
                "Møns Klint er en af Danmarks smukkeste naturoplevelser. " +
                        "De hvide kridtklipper rejser sig majestætisk over Østersøen. " +
                        "Området er perfekt til vandreture, fuglekiggeri og fossiljagt. " +
                        "Besøgende kan også udforske Geocenter Møns Klint for mere viden."));

        attractions.add(new TouristAttraction("Nationalmuseet",
                "Nationalmuseet i København er Danmarks største museum for kulturhistorie. " +
                        "Det rummer en stor samling af genstande fra vikingetiden til nutiden. " +
                        "Her kan man opleve alt fra runesten til kongelige skatte. " +
                        "Museet tilbyder også interaktive udstillinger for børn og voksne."));

        attractions.add(new TouristAttraction("Operaen",
                "Operaen i København er en af verdens mest moderne operabygninger. " +
                        "Den ligger smukt placeret ved Københavns Havn og blev åbnet i 2005. " +
                        "Bygningen er designet af Henning Larsen og finansieret af A.P. Møller. " +
                        "Operaen tilbyder en række forestillinger fra klassisk opera til ballet."));

        attractions.add(new TouristAttraction("Søerne",
                "Søerne ved Østerbro er et populært område til gå- og løbeture. " +
                        "De tre søer - Sortedams Sø, Peblinge Sø og Sankt Jørgens Sø - skaber en grøn oase. " +
                        "Om sommeren er området fyldt med folk, der nyder solen. " +
                        "Det er også hjemsted for mange fuglearter og smukke udsigter."));

        attractions.add(new TouristAttraction("Ribe Domkirke",
                "Ribe Domkirke er Danmarks ældste domkirke, grundlagt i 1100-tallet. " +
                        "Den er kendt for sin imponerende arkitektur og høje tårn. " +
                        "Inde i kirken findes smukke kalkmalerier og en historisk altertavle. " +
                        "Domkirken er et vigtigt religiøst og kulturelt centrum i Ribe."));

        attractions.add(new TouristAttraction("Bornholm",
                "Bornholm er en idyllisk ø i Østersøen kendt for sine naturskønne omgivelser. " +
                        "Øen har spektakulære klippeformationer, hvide sandstrande og dybe skove. " +
                        "Hammershus Slotsruin er en af Bornholms mest populære seværdigheder. " +
                        "Lokale delikatesser som røgede sild er et must-try for besøgende."));

        attractions.add(new TouristAttraction("Egeskov Slot",
                "Egeskov Slot er et af Europas bedst bevarede renæssanceslotte. " +
                        "Slottet ligger smukt omgivet af vand og har en stor historisk have. " +
                        "Besøgende kan opleve eventyrlige sale og et imponerende veteranmuseum. " +
                        "Området har også en stor legepark, labyrinter og trætopbaner."));

        attractions.add(new TouristAttraction("Skagen",
                "Skagen er kendt for sine fantastiske sandstrande og kunstneriske arv. " +
                        "Byen er hjemsted for Grenen, hvor Skagerrak og Kattegat mødes. " +
                        "Skagensmalerne, en gruppe berømte kunstnere, fandt inspiration her. " +
                        "Byen byder også på hyggelige fiskerestauranter og ikoniske gule huse."));
    }



    // creates a new attraction object and adds it to the attractions list.
    public void addAttraction(TouristAttraction attraction) {
        attractions.add(attraction);
    }

    // Get all attractions
    public List<TouristAttraction> getAllAttractions() {
        return attractions;
    }

    // Get first 10 attractions
    public List<TouristAttraction> getFirstAttractions() {
        List<TouristAttraction> firstAttractions = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            firstAttractions.add(attractions.get(i));
        }

        return firstAttractions;
    }

    //delete an attraction
    public boolean deleteAttraction(String name) {
        String cleanedName = name.trim();
        return attractions.removeIf(attraction -> attraction.getName().equalsIgnoreCase(cleanedName));

    }


    //get attraction by name
    public Optional<TouristAttraction> getAttractionByName(String name) {
        for (TouristAttraction attraction : attractions) {
            if (attraction.getName().equalsIgnoreCase(name)) {
                return Optional.of(attraction);
            }
        }
        return Optional.empty(); // uses optional for better nullhandling. instead of returning null.
    }

    //update an attraction with new name and description by finding it with the name.
    public boolean updateAttraction(String name, String newName, String newDescription) {
        if (name == null || newName == null || newDescription == null) {
            return false;
        }

        if (newName.trim().isEmpty() || newDescription.trim().isEmpty()) {
            return false;
        }

        if (!newName.chars().allMatch(Character::isLetter)) {
            return false;
        }

        for (TouristAttraction attraction : attractions) {
            if (attraction.getName().equalsIgnoreCase(name)) { // Case-insensitive match
                attraction.setName(newName);
                attraction.setDescription(newDescription);
                return true;
            }
        }
        return false; // Attraction not found
    }

}
