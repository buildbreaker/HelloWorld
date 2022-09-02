// Code generated by Wire protocol buffer compiler, do not edit.
// Source: proto3.simple.MessageFieldMsg in simple.proto
import Foundation
import Wire

/**
 *  trailing docs for MessageFieldMsg
 */
public struct MessageFieldMsg {

    /**
     *  trailing doc comment
     */
    public var msg: StringMsg?
    public var unknownFields: Data = .init()

    public init(msg: StringMsg? = nil) {
        self.msg = msg
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension MessageFieldMsg : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension MessageFieldMsg : Hashable {
}
#endif

extension MessageFieldMsg : Proto3Codable {
    public init(from reader: ProtoReader) throws {
        var msg: StringMsg? = nil

        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            case 1: msg = try reader.decode(StringMsg.self)
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

        self.msg = msg
    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.encode(tag: 1, value: self.msg)
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension MessageFieldMsg : Codable {
    public enum CodingKeys : String, CodingKey {

        case msg

    }
}
#endif