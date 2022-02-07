package libplex.plex.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class User {
    /*
     * TODO Completare
     * <user email="coviello.gl@gmail.com" id="15840475" uuid="d6c1f1e826d88d6f"
     * mailing_list_status="unsubscribed"
     * thumb="https://plex.tv/users/d6c1f1e826d88d6f/avatar?c=1558547487"
     * username="gianlucacoviello" title="gianlucacoviello" cloudSyncDevice=""
     * locale="" authenticationToken="-TLuzshzJT_LzpsN1s6d"
     * authToken="-TLuzshzJT_LzpsN1s6d" scrobbleTypes="" restricted="0" home="0"
     * guest="0" queueEmail="queue+96w5tDWy6BUGGTx7PQSr@save.plex.tv"
     * queueUid="" hasPassword="true" homeSize="1" maxHomeSize="15"
     * rememberMe="false" secure="1" certificateVersion="3">
     * <subscription active="0" status="Inactive" plan="">
     * <feature id="home"/>
     * <feature id="adaptive_bitrate"/>
     * <feature id="collections"/>
     * <feature id="photos-metadata-edition"/>
     * <feature id="radio"/>
     * <feature id="tuner-sharing"/>
     * <feature id="photos-favorites"/>
     * <feature id="federated-auth"/>
     * <feature id="livetv"/>
     * <feature id="Android - PiP"/>
     * <feature id="unsupportedtuners"/>
     * <feature id="kevin-bacon"/>
     * <feature id="client-radio-stations"/>
     * <feature id="TREBLE-show-features"/>
     * <feature id="web_server_dashboard"/>
     * <feature id="conan_redirect_qa"/>
     * <feature id="conan_redirect_alpha"/>
     * <feature id="conan_redirect_beta"/>
     * <feature id="conan_redirect_public"/>
     * <feature id="transcoder_cache"/>
     * <feature id="live-tv-support-incomplete-segments"/>
     * <feature id="companions_sonos"/>
     * <feature id="exclude restrictions"/>
     * <feature id="signin_with_apple"/>
     * <feature id="drm_support"/>
     * <feature id="Android - Dolby Vision"/>
     * <feature id="spring_serve_ad_provider"/>
     * <feature id="lets_encrypt"/>
     * <feature id="conan_redirect_nightlies"/>
     * <feature id="conan_redirect_nightly"/>
     * <feature id="watch-together-invite"/>
     * <feature id="ios14-privacy-banner"/>
     * <feature id="two-factor-authentication"/>
     * <feature id="amazon-loop-debug"/>
     * <feature id="retro-games-plex-tv"/>
     * <feature id="vod_cloudflare"/>
     * <feature id="optimize-server-users-endpoint"/>
     * <feature id="metadata_search"/>
     * <feature id="CU Sunset"/>
     * <feature id="news-provider-sunset-modal"/>
     * <feature id="custom-home-removal"/>
     * <feature id="guided-upgrade"/>
     * <feature id="upgrade-3ds2"/>
     * </subscription>
     * 
     * private Entitlements entitlements;
     * <entitlements all="0">
     * </entitlements>
     * 
     * private ProfileSettings profileSettings;
     * <profile_settings default_audio_language="it" default_subtitle_language="en"
     * auto_select_subtitle="0" auto_select_audio="0"
     * default_subtitle_accessibility="0" default_subtitle_forced="0"/>
     * 
     * private Providers providers;
     * 
     * <providers>
     * <provider id="google_federated" uid="coviello.gl@gmail.com" token=
     * "eyJhbGciOiJSUzI1NiIsImtpZCI6IjAyOWYyNjlmM2YwNmFmMWU5M2RhYzY3MDYzOTc3ZjcxM2E3N2YxOWUifQ.eyJhenAiOiI5NTQzOTYxMDczMTEtdnBkaTBpZTY5MDVqMXByOHVkYzJ2MWRybTlwMGtuMHAuYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJhdWQiOiI5NTQzOTYxMDczMTEtdnBkaTBpZTY5MDVqMXByOHVkYzJ2MWRybTlwMGtuMHAuYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJzdWIiOiIxMTM3MDMwNjY2NzQ4NDI3Nzk3MjMiLCJlbWFpbCI6ImNvdmllbGxvLmdsQGdtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJhdF9oYXNoIjoianlRYmNPNERFN083OFMyMEtnakdpZyIsImV4cCI6MTUyNjY3ODc5MCwiaXNzIjoiYWNjb3VudHMuZ29vZ2xlLmNvbSIsImp0aSI6ImIwODMzMjg2MGIyMTQxYTk0ZmNmMGFmOGJhOTNkZDExNDM0ZGI1ZTAiLCJpYXQiOjE1MjY2NzUxOTAsIm5hbWUiOiJHaWFubHVjYSBDb3ZpZWxsbyIsInBpY3R1cmUiOiJodHRwczovL2xoNS5nb29nbGV1c2VyY29udGVudC5jb20vLVBGSTY1N2dkMExNL0FBQUFBQUFBQUFJL0FBQUFBQUFBQWk4L01JclM4Z0dhS1pVL3M5Ni1jL3Bob3RvLmpwZyIsImdpdmVuX25hbWUiOiJHaWFubHVjYSIsImZhbWlseV9uYW1lIjoiQ292aWVsbG8iLCJsb2NhbGUiOiJpdCJ9.pR-0ZifmQE1ohRCgPE_xgvm0vkLfLWuSAEksyVPKiy2rPryMhAAQfGgQs8bmSC5zVwlT6YCzBNepdXCP4ajLpOpsXh40Tr3n30fFJs6L07aCqHRNyUMyG-0PqZtWfODiwgOsGw9LvMns4OjPm01Vo1a13mX0puj9zikON7hdZ3z0EcuyIkmahsIbc7wq4qFljgKvbsCLC5EmnPYvyFjHa9U6JGsVzPOO864yres0vcsARVftabmlWqds2DtNjmFf6WNnsZoaAr5XRP9RUfiI0LbgskDgLGRlr9-rJaNsu-lDmPNpjoSMrgpgIQg6gllbRaRzcLLAQGR-cIqFnhNMJA"
     * />
     * </providers>
     * 
     * private Services services;
     * <services>
     * <service identifier="epg" endpoint="https://epg.provider.plex.tv"
     * token="RkHIzgbqTjP2giDabsWdbBB9o4YNyhS6CqbTgwfKAOc=" status="online"/>
     * <service identifier="epg-staging"
     * endpoint="https://epg-staging.provider.plex.tv"
     * token="RkHIzgbqTjP2giDabsWdbBB9o4YNyhS6CqbTgwfKAOc=" status="online"/>
     * <service identifier="epg-dev" endpoint="https://epg-dev.provider.plex.tv"
     * token="RkHIzgbqTjP2giDabsWdbBB9o4YNyhS6CqbTgwfKAOc=" status="online"/>
     * <service identifier="eyeq"
     * endpoint="https://c4412416.ipg.web.cddbp.net/webapi/xml/1.0/"
     * token="6iUU7VrBzA/Hz5nsS9o65Yz77qvh63pYmUN+TaVHeonhsQWlzYGcsik1opEU3toj"
     * status="online"/>
     * <service identifier="eyeq-channel-icons"
     * endpoint="http://akamai-b.cdn.cddbp.net/cds/2.0/image" status="online"/>
     * <service identifier="graph-dev" endpoint="https://graph-dev.provider.plex.tv"
     * status="online"/>
     * <service identifier="graph-staging"
     * endpoint="https://graph-staging.provider.plex.tv" status="online"/>
     * <service identifier="metadata" endpoint="https://metadata.provider.plex.tv"
     * token="1vme2aaK6G8fZFtFyKeSmInEvdjpjsHEto45VgX1K0c=" status="online"/>
     * <service identifier="metadata-dev"
     * endpoint="https://metadata-dev.provider.plex.tv"
     * token="1vme2aaK6G8fZFtFyKeSmInEvdjpjsHEto45VgX1K0c=" status="online"/>
     * <service identifier="metadata-provider" endpoint="https://mpm.plex.tv/"
     * status="online"/>
     * <service identifier="tmsapi" endpoint="https://tmsapi.plex.tv/v1.1/"
     * token="a0VC3zjGN7FmzvlZKIuRRUjLCRoQkgY2jwJsLgi8+OQ=" status="online"/>
     * <service identifier="subtitles-search"
     * endpoint="https://metadata.provider.plex.tv/library/metadata/matches"
     * token="1vme2aaK6G8fZFtFyKeSmInEvdjpjsHEto45VgX1K0c=" status="online"/>
     * <service identifier="acoustid" endpoint="https://acoustid.plex.tv/"
     * token="XxQtK3u05uaxTaZ6Y6jcrw==" status="online"/>
     * <service identifier="lyricfind" endpoint="https://lyricfind.plex.tv/"
     * token="X46ofmSoyOTWjBU4oEx0Rb0ATQjYW31IgFeXw3+/n5hMfGoF7PLEMPrLT9v/zqV1"
     * secret="H8q1AfgeOcf8+wx2ODos1mLBkmsSE4PMCJkkdx27xNwpzzKVV3up6gZJb+teyIOw"
     * status="online"/>
     * <service identifier="lyricfind-search" endpoint="https://lyricfind.plex.tv/"
     * token="4HRR+YgScsy+71q8J31KgROAuPkWvsus8XQuVFjYUiTjw5f+LesQ8MAgEcjnuYxW"
     * status="online"/>
     * <service identifier="tvdb" endpoint="https://api4.thetvdb.com/"
     * token="CFlmhH676IvrFij0l4BR1YNRtyHjz+9EAH+GU5ZgncfJ3ufdmzWK/3giK1Ovei7u"
     * status="online"/>
     * </services>
     * <username>gianlucacoviello</username>
     * <email>coviello.gl@gmail.com</email>
     * <joined-at type="datetime">2017-11-10 21:48:14 UTC</joined-at>
     * <authentication-token>-TLuzshzJT_LzpsN1s6d</authentication-token>
     * </user>
     */

    private String authenticationToken;

    public String getAuthenticationToken() {
	return authenticationToken;
    }

    public void setAuthenticationToken(String authenticationToken) {
	this.authenticationToken = authenticationToken;
    }
}
